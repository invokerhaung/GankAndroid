package rubic.gankandroid.app;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import rubic.gankandroid.di.AppComponent;
import rubic.gankandroid.di.DaggerAppComponent;

/**
 * Created by invokerhuang on 2017/9/18.
 */

public class MyApp extends Application implements HasActivityInjector {
    @Inject
    DispatchingAndroidInjector<Activity> activityInjector;
    private AppComponent appComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        initComponent();
    }

    private void initComponent() {
        appComponent = DaggerAppComponent.builder().build();
    }

    public AppComponent getComponent() {
        return appComponent;
    }
    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityInjector;
    }
}
