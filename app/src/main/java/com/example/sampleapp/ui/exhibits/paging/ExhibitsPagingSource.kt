package com.example.sampleapp.ui.exhibits.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.sampleapp.domain.exhibits.Exhibit
import com.example.sampleapp.network.ApiEmptyResponse
import com.example.sampleapp.network.ApiErrorResponse
import com.example.sampleapp.network.ApiSuccessResponse
import com.example.sampleapp.repository.MuseumRepo
import com.example.sampleapp.repository.MuseumRepoImpl
import com.example.sampleapp.utils.Event
import kotlinx.coroutines.flow.update
import retrofit2.HttpException
import timber.log.Timber
import java.io.IOException

class ExhibitsPagingSource(val repo: MuseumRepo) : PagingSource<Int, Exhibit>() {

    private val TAG: String = ExhibitsPagingSource::class.simpleName!!
    override suspend fun load(
        params: LoadParams<Int>
    ): LoadResult<Int, Exhibit> {
        try {
            // Start refresh at page 0 if undefined.
            var nextPageNumber = params.key ?: 0
            Timber.tag(TAG).d("Loading page $nextPageNumber")
            return when (val response = repo.getExhibits(nextPageNumber)) {
                is ApiSuccessResponse -> {
                    LoadResult.Page(
                        data = response.body,
                        prevKey = null, // Only paging forward.
                        nextKey = ++nextPageNumber
                    )
                }
                is ApiEmptyResponse -> {
                    LoadResult.Error(Throwable("Empty responseee"))
                }
                is ApiErrorResponse -> {
                    LoadResult.Error(Throwable("Error responseee"))
                }
            }
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
