package com.rongxianren.desinwidget.custombehavior

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.rongxianren.desinwidget.R
import com.rongxianren.desinwidget.custombehavior.fragments.BlankFragment
import com.rongxianren.desinwidget.custombehavior.fragments.BlankFragment2
import com.rongxianren.desinwidget.custombehavior.fragments.BlankFragment3
import kotlinx.android.synthetic.main.activity_container.*
import kotlinx.android.synthetic.main.activity_container.view.*

class ContainerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)

        viewpager.adapter = MyViewPagerAdapter(supportFragmentManager)
        tablayout.setupWithViewPager(viewpager)
    }


    class MyViewPagerAdapter(fm: FragmentManager) :
        FragmentPagerAdapter(fm, BEHAVIOR_SET_USER_VISIBLE_HINT) {
        val mTitles = arrayOf("精选", "分类", "收藏")
        val fragments = arrayOf(
            BlankFragment.newInstance("", ""),
            BlankFragment2.newInstance("", ""),
            BlankFragment3.newInstance("", "")
        )

        override fun getItem(position: Int): Fragment {
            return fragments[position]
        }

        override fun getCount(): Int {
            return mTitles.size
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return mTitles[position]
        }
    }
}
