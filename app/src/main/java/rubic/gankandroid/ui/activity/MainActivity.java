package rubic.gankandroid.ui.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.roughike.bottombar.OnTabSelectListener;

import java.util.ArrayList;
import java.util.List;

import dagger.android.AndroidInjection;
import rubic.gankandroid.R;
import rubic.gankandroid.databinding.ActivityMainBinding;
import rubic.gankandroid.ui.fragment.HomeFragment;
import rubic.gankandroid.utils.FragmentUtils;

public class MainActivity extends AppCompatActivity {
   private ActivityMainBinding binding;
    private List<Fragment> fragments = new ArrayList<>();
    private List<String> titles = new ArrayList<>();
    private int index=0;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        AndroidInjection.inject(this);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        initdata();
    }

    private void initview() {
    }

    private void initdata() {
        fragments.add(new HomeFragment());
        fragments.add(new HomeFragment());
        fragments.add(new HomeFragment());
        binding.mainBottom.setOnTabSelectListener(selectListener);

    }
    private OnTabSelectListener selectListener=tabId -> {
        switch (tabId) {
            case R.id.tab_home:
                index=0;
                break;
            case R.id.tab_girl:
                index=1;
                break;
            case R.id.tab_collec:
                index=2;
                break;
        }
        FragmentUtils.hideAllShowFragment(fragments.get(index));
    };
}
