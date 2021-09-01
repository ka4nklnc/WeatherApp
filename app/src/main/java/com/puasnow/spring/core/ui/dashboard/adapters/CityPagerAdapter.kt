package com.puasnow.spring.core.ui.dashboard.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.puasnow.spring.core.ui.dashboard.viewholders.CityViewHolder
import com.puasnow.spring.databinding.ItemDashboardCityBinding
import com.puasnow.spring.models.CityModel
import com.puasnow.spring.models.DayModel
import com.puasnow.spring.models.WeatherModel
import com.puasnow.spring.models.WeatherTypes

class CityPagerAdapter: PagerAdapter() {
    val list = ArrayList<CityModel>()

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val model = list[position]
        val inflater = LayoutInflater.from(container.context)
        val mBinding = ItemDashboardCityBinding.inflate(inflater,container,false)
        CityViewHolder(mBinding).bind(model)
        container.addView(mBinding.root)
        return mBinding.root
    }

    override fun getCount(): Int {
       return list.size
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView((`object` as View))
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    fun submitList(list: List<CityModel>) {
        this.list.clear()
        this.list.addAll(list)
        this.notifyDataSetChanged()
    }

    override fun getPageWidth(position: Int) =  1f

}