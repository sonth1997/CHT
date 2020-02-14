package com.example.quanlichitieu.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.quanlichitieu.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
//    lateinit var adapter: MyFragment
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home,container,false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        adapter = MyFragment(childFragmentManager)
//        adapter.addFragment(OneFragment(),"1/2019")
//        adapter.addFragment(TwoFragment(),"2/2019")
//        adapter.addFragment(ThreeFragment(),"3/2019")
//        adapter.addFragment(FourFragment(),"4/2019")
//        adapter.addFragment(FiveFragment(),"5/2019")
//        adapter.addFragment(SixFragment(),"6/2019")
//        adapter.addFragment(SevenFragment(),"7/2019")
//        adapter.addFragment(EightFragment(),"8/2019")
//        adapter.addFragment(NineFragment(),"9/2019")
//        adapter.addFragment(TenFragment(),"10/2019")
//        adapter.addFragment(ElevenFragment(),"11/2019")
//        adapter.addFragment(TwelveFragment(),"12/2019")
//        adapter.addFragment(PastFragment(),"THÁNG TRƯỚC")
//        adapter.addFragment(PresentFragment(),"THÁNG NÀY")
//        adapter.addFragment(FutureFragment(),"TƯƠNG LAI")
//        viewPagerHome.adapter = adapter
//        tabLayoutHome.setupWithViewPager(viewPagerHome)

    }
//    inner class MyFragment(manager: FragmentManager): FragmentPagerAdapter(manager){
//        private val fragmentList: MutableList<Fragment> = ArrayList()
//        private val titleList: MutableList<String> = ArrayList()
//
//        override fun getItem(position: Int): Fragment {
//            return fragmentList[position]
//        }
//        override fun getCount(): Int {
//            return fragmentList.size
//        }
//        fun addFragment(fragment: Fragment,title: String){
//            fragmentList.add(fragment)
//            titleList.add(title)
//        }
//        override fun getPageTitle(position: Int): CharSequence? {
//            return titleList[position]
//        }
//    }
}