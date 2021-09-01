package com.puasnow.spring.core.ui.dashboard.viewholders

import androidx.recyclerview.widget.RecyclerView
import com.puasnow.spring.databinding.ItemDashboardDayBinding
import com.puasnow.spring.models.DayModel

class DayViewHolder(val mBinding: ItemDashboardDayBinding): RecyclerView.ViewHolder(mBinding.root) {
    fun bind(item : DayModel) : RecyclerView.ViewHolder{
        mBinding.model = item
        mBinding.imageView3.setImageResource(item.weather.Type.imageResource)
        return this
    }
}