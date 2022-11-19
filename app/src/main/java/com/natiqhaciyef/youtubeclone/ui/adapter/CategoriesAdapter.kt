package com.natiqhaciyef.youtubeclone.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.natiqhaciyef.youtubeclone.data.model.Category
import com.natiqhaciyef.youtubeclone.databinding.RecyclerCategoriesBinding

class CategoriesAdapter(var mContext: Context, var list: List<Category>) : RecyclerView.Adapter<CategoriesAdapter.CategoryHolder>() {

    inner class CategoryHolder(var binding: RecyclerCategoriesBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        val binding = RecyclerCategoriesBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CategoryHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        val itemView = holder.binding
        val category = list[position]

        itemView.recyclerCategoriesNameText.text = category.name

        if (category.image.isNullOrEmpty())
            itemView.recyclerCategoriesImage.visibility = View.GONE
        else
            itemView.recyclerCategoriesImage.setImageResource(mContext.resources.getIdentifier(category.image, "drawable",mContext.packageName))
    }

    override fun getItemCount(): Int {
        return list.size
    }
}