package rubic.gankandroid.di;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import rubic.gankandroid.app.MyApp;
import rubic.gankandroid.di.module.ActivityBuilderModule;
import rubic.gankandroid.di.module.NetModule;

/**
 * Created by invokerhuang on 2017/9/19.
 */
@Singleton
@Component(modules = {
        NetModule.class,
        AndroidInjectionModule.class,
        ActivityBuilderModule.class
})
public interface AppComponent {
    void inject(MyApp app);
}
