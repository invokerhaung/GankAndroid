package rubic.gankandroid.ui.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import rubic.gankandroid.R;
import rubic.gankandroid.databinding.ActivityDetailBinding;

/**
 * Created by invokerhuang on 2017/9/18.
 */

public class DetailActivity extends AppCompatActivity {
    private ActivityDetailBinding binding;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);
    }
}
