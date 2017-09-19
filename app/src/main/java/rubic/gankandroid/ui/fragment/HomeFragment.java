package rubic.gankandroid.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import rubic.gankandroid.databinding.FragmentHomeBinding;
import rubic.gankandroid.ui.adapter.HomePageAdapter;
import rubic.gankandroid.utils.CategoryType;

/**
 * Created by invokerhuang on 2017/9/18.
 */

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private List<Fragment> fragments=new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = binding.inflate(inflater, container,false);
        initData();
        return binding.getRoot();
    }

    private void initData() {
        fragments.add(CateFragment.newInstance(CategoryType.ANDROID_STR));
        fragments.add(CateFragment.newInstance(CategoryType.IOS_STR));
        fragments.add(CateFragment.newInstance(CategoryType.QIAN_STR));
        binding.homePager.setOffscreenPageLimit(fragments.size());
        binding.homePager.setAdapter(new HomePageAdapter(getChildFragmentManager(), fragments));
        binding.homeTabs.setupWithViewPager(binding.homePager);
    }
}
