package com.example.sampleapp.ui.exhibits.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.sampleapp.models.domain.exhibits.Exhibit
import com.example.sampleapp.repository.MuseumRepoImpl
import retrofit2.HttpException
import timber.log.Timber
import java.io.IOException

class ExhibitsPagingSource(
    val backend: MuseumRepoImpl,
    val query: String
) : PagingSource<Int, Exhibit>() {

    private val TAG: String = ExhibitsPagingSource::class.simpleName!!
    override suspend fun load(
        params: LoadParams<Int>
    ): LoadResult<Int, Exhibit> {
        try {
            // Start refresh at page 1 if undefined.
            val nextPageNumber = params.key ?: 1
            val response = backend.getExhibits(query, nextPageNumber)
            return LoadResult.Page(
                data = response,
                prevKey = null, // Only paging forward.
                nextKey = response.nextPageNumber
            )
        } catch (e: IOException) {
            // IOException for network failures.
            Timber.tag(TAG).e(e, "IOException: $e")
            return LoadResult.Error(e)
        } catch (e: HttpException) {
            // HttpException for any non-2xx HTTP status codes.
            Timber.tag(TAG).e("HttpException: $e")
            return LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, Exhibit>): Int? {
        // Try to find the page key of the closest page to anchorPosition from
        // either the prevKey or the nextKey; you need to handle nullability
        // here.
        //  * prevKey == null -> anchorPage is the first page.
        //  * nextKey == null -> anchorPage is the last page.
        //  * both prevKey and nextKey are null -> anchorPage is the
        //    initial page, so return null.
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }
}
