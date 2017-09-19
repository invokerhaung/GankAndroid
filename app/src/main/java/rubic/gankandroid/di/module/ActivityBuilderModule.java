package rubic.gankandroid.di.module;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import rubic.gankandroid.di.scope.ActivityScope;
import rubic.gankandroid.ui.activity.MainActivity;

/**
 * Created by invokerhuang on 2017/9/19.
 */
@Module
public abstract class ActivityBuilderModule {
    @ActivityScope
    @ContributesAndroidInjector
    abstract MainActivity mainActivity();
}
