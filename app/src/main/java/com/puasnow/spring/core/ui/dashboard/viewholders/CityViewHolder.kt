package com.puasnow.spring.core.ui.dashboard.viewholders

import androidx.recyclerview.widget.RecyclerView
import com.puasnow.spring.databinding.ItemDashboardCityBinding
import com.puasnow.spring.models.CityModel

class CityViewHolder(val mBinding: ItemDashboardCityBinding):RecyclerView.ViewHolder(mBinding.root) {
    fun bind(item: CityModel) {
        mBinding.model = item

        mBinding.imageView.setImageResource(item.backgroundUrl)
    }
}