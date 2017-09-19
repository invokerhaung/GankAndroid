package rubic.gankandroid.di.module;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import rubic.gankandroid.di.scope.FragmentScope;
import rubic.gankandroid.ui.fragment.HomeFragment;

/**
 * Created by invokerhuang on 2017/9/19.
 */
@Module
public abstract class FragmentBuilderModule {
    @FragmentScope
    @ContributesAndroidInjector
    abstract HomeFragment homeFragment() ;



}
