package rubic.gankandroid.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import rubic.gankandroid.databinding.FragmentCateBinding;
import rubic.gankandroid.ui.adapter.CateItemAdapter;

/**
 * Created by invokerhuang on 2017/9/18.
 */

public class CateFragment extends Fragment {


    private FragmentCateBinding binding;
    public static final String TYPE = "type";
    private String type = "";
    public static CateFragment newInstance(String type) {
        CateFragment fragment = new CateFragment();
        Bundle bundle = new Bundle();
        bundle.putString(TYPE,type);
        fragment.setArguments(bundle);
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        binding = binding.inflate(inflater, container, false);
        initData();
        return binding.getRoot();
    }

    private void initData() {
        if (getArguments() != null) {
            type = getArguments().getString(TYPE);
            binding.cateRcy.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
            binding.cateRcy.setAdapter(new CateItemAdapter());
        }
    }
}
