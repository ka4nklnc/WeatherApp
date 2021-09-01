package com.puasnow.spring.core.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.puasnow.spring.R
import com.puasnow.spring.core.ui.dashboard.adapters.CityPagerAdapter
import com.puasnow.spring.core.ui.dashboard.adapters.DayPagerAdapter
import com.puasnow.spring.databinding.FragmentDashboardBinding
import com.puasnow.spring.models.CityModel
import com.puasnow.spring.models.DayModel
import com.puasnow.spring.models.WeatherModel
import com.puasnow.spring.models.WeatherTypes

class DashboardFragment: Fragment() {

    private lateinit var mBinding: FragmentDashboardBinding


    private val mDayAdapter: DayPagerAdapter by lazy {
        val adapter = DayPagerAdapter()
        adapter.submitList(fakeData())
        adapter
    }

    private val mCityAdapter: CityPagerAdapter by lazy {
        val adapter = CityPagerAdapter()
        adapter.submitList(fakeCityData())
        adapter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding = FragmentDashboardBinding.inflate(inflater,container,false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(mBinding){
            daysViewPager.adapter = mDayAdapter
            citiesViewPager.adapter = mCityAdapter
            dotsIndicator.setViewPager(citiesViewPager)
        }
    }

    private fun fakeCityData(): List<CityModel> {
        val list = ArrayList<CityModel>()
        //url olacak
        val koycegiz = R.drawable.koycegiz
        val fethiye = R.drawable.fethiye

        list.add(CityModel("Köyceğiz",koycegiz,DayModel("Bugün", WeatherModel(32,30,WeatherTypes.Sunny))))
        list.add(CityModel("Fethiye",fethiye,DayModel("Bugün",WeatherModel(35,27,WeatherTypes.Cloudy))))

        return list;
    }

    private fun fakeData():List<DayModel>{
        val list = ArrayList<DayModel>()
        list.add(DayModel("Today", WeatherModel(27,15,WeatherTypes.Cloudy)))
        list.add(DayModel("Tomorrow", WeatherModel(25,23,WeatherTypes.Rainy)))
        list.add(DayModel("Friday", WeatherModel(27,-3,WeatherTypes.Snowy)))
        list.add(DayModel("Saturday", WeatherModel(15,5,WeatherTypes.Snowy)))
        list.add(DayModel("Sunday", WeatherModel(27,15,WeatherTypes.Sunny)))
        list.add(DayModel("Monday", WeatherModel(27,15,WeatherTypes.Cloudy)))
        list.add(DayModel("Tuesday", WeatherModel(27,15,WeatherTypes.Sunny)))
        list.add(DayModel("Friday", WeatherModel(27,-3,WeatherTypes.Snowy)))
        list.add(DayModel("Saturday", WeatherModel(15,5,WeatherTypes.Snowy)))
        list.add(DayModel("Sunday", WeatherModel(27,15,WeatherTypes.Sunny)))
        list.add(DayModel("Monday", WeatherModel(27,15,WeatherTypes.Cloudy)))
        list.add(DayModel("Tuesday", WeatherModel(27,15,WeatherTypes.Sunny)))
        list.add(DayModel("Friday", WeatherModel(27,-3,WeatherTypes.Snowy)))
        list.add(DayModel("Saturday", WeatherModel(15,5,WeatherTypes.Snowy)))
        list.add(DayModel("Sunday", WeatherModel(27,15,WeatherTypes.Cloudy)))
        list.add(DayModel("Monday", WeatherModel(27,15,WeatherTypes.Sunny)))
        list.add(DayModel("Tuesday", WeatherModel(27,15,WeatherTypes.Sunny)))
        return list;
    }


}