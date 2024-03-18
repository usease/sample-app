package com.example.sampleapp.ui.exhibits.paging

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleapp.R
import com.example.sampleapp.models.domain.exhibits.Exhibit

class ExhibitsAdapter(diffCallback: DiffUtil.ItemCallback<Exhibit>) :
    PagingDataAdapter<Exhibit, ExhibitsAdapter.ExhibitViewHolder>(diffCallback) {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ExhibitViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_exhibit, viewGroup, false)

        return ExhibitViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExhibitViewHolder, position: Int) {
        val item = getItem(position)
        // Note that item can be null. ViewHolder must support binding a
        // null item as a placeholder.
        holder.apply {
            tvTitle.text = item?.title
        }
    }

    class ExhibitViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvTitle: TextView

        init {
            tvTitle = view.findViewById(R.id.tvTitle)
        }
    }
}