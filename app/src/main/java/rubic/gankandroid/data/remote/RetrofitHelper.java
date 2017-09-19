package rubic.gankandroid.data.remote;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import rubic.gankandroid.Constant;

/**
 * Created by invokerhuang on 2017/9/18.
 */

public class RetrofitHelper {

    private static Retrofit retrofit;
    private static final long DEFAULT_JSON_CACHE_SIZE = 250 * 1024 * 1204;



    public static GankService getApiService() {
        return getRetrofit().create(GankService.class);
    }


    public static Retrofit getRetrofit() {
        OkHttpClient client = new OkHttpClient.Builder()

                .build();
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .client(client)
                    .baseUrl(Constant.BASEURL)
                    .addConverterFactory(GsonConverterFactory.create(getGson()))
                    .build();
        }
        return retrofit;
    }

    /**
     * java bean 转化json数据  序列化
     * 解析反序列化
     */
    public static Gson getGson() {
        return new GsonBuilder()
                .serializeNulls()//允许序列化反序列化为null
                .create();
    }
}
