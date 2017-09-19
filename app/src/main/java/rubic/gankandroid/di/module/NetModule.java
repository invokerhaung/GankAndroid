package rubic.gankandroid.di.module;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import rubic.gankandroid.Constant;
import rubic.gankandroid.data.remote.GankService;

/**
 * Created by invokerhuang on 2017/9/19.
 */
@Module
public class NetModule {
    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient() {
        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();
        okHttpClient.connectTimeout(Constant.TIMEOUT_IN_SEC, TimeUnit.SECONDS);
        okHttpClient.readTimeout(Constant.TIMEOUT_IN_SEC, TimeUnit.SECONDS);
        return okHttpClient.build();
    }

    @Provides
    @Singleton
    GankService provideGankService(OkHttpClient okHttpClient) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constant.BASEURL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
        return retrofit.create(GankService.class);
    }
}
