package rubic.gankandroid.data.remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rubic.gankandroid.data.entry.GankEntity;

/**
 * Created by invokerhuang on 2017/9/18.
 */

public interface GankService {

    @GET("data/{type}/{pageSize}/{page}")
    Call<GankEntity> getGank(@Path("type") String type, @Path("pageSize") int size, @Path("page") String page);

    // 随机获取一个妹子
    @GET("random/data/福利/1")
    Call<GankEntity> getRandomGirl();
}
