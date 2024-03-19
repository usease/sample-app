package com.example.sampleapp.ui.exhibits.paging

import androidx.recyclerview.widget.DiffUtil
import com.example.sampleapp.domain.exhibits.Exhibit

object ExhibitComparator : DiffUtil.ItemCallback<Exhibit>() {
    override fun areItemsTheSame(oldItem: Exhibit, newItem: Exhibit): Boolean {
        // Id is unique.
        return oldItem.objectNumber == newItem.objectNumber
    }

    override fun areContentsTheSame(oldItem: Exhibit, newItem: Exhibit): Boolean {
        return oldItem == newItem
    }
}