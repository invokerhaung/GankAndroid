package rubic.gankandroid.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import rubic.gankandroid.utils.CategoryType;

/**
 * Created by invokerhuang on 2017/9/19.
 */

public class HomePageAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments;
    public HomePageAdapter(FragmentManager fm,List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return CategoryType.getPageTitleByPosition(position);
    }
}
