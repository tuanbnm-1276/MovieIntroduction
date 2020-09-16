package com.example.android.movieintroduction.base

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

abstract class BaseRecyclerAdapter<Item, VB : ViewDataBinding>(
    callback: DiffUtil.ItemCallback<Item>
) : ListAdapter<Item, BaseViewHolder<VB>>(callback) {

    override fun submitList(list: List<Item>?) {
        super.submitList(ArrayList<Item>(list ?: listOf()))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<VB> {
        return BaseViewHolder(
            DataBindingUtil.inflate<VB>(
                LayoutInflater.from(parent.context),
                getLayoutRes(viewType), parent, false

            ).apply {
                bindFirstTime(this)
            })
    }

    override fun onBindViewHolder(holder: BaseViewHolder<VB>, position: Int) {
        val item: Item? = getItem(position)
        item?.let {
            bindView(holder.binding, item, position)
        }
        holder.binding.executePendingBindings()
    }

    protected open fun bindView(binding: VB, item: Item, position: Int){}

    protected open fun bindFirstTime(vb: VB) {}

    protected abstract fun getLayoutRes(viewType: Int): Int

}

open class BaseViewHolder<VB : ViewDataBinding>(
    val binding: VB
) : RecyclerView.ViewHolder(binding.root)
