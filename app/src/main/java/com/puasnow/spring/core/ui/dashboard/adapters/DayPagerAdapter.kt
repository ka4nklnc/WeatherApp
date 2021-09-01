package com.puasnow.spring.core.ui.dashboard.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.puasnow.spring.core.ui.dashboard.viewholders.DayViewHolder
import com.puasnow.spring.databinding.ItemDashboardDayBinding
import com.puasnow.spring.models.DayModel

class DayPagerAdapter : PagerAdapter() {

    val list = ArrayList<DayModel>()

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val model = list[position]
        val inflater = LayoutInflater.from(container.context)
        val mBinding = ItemDashboardDayBinding.inflate(inflater,container,false)
        DayViewHolder(mBinding).bind(model)
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

    fun submitList(list: List<DayModel>) {
        this.list.clear()
        this.list.addAll(list)
        this.notifyDataSetChanged()
    }

    override fun getPageWidth(position: Int) =  0.33f


}