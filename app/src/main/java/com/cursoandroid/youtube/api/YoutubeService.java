package com.cursoandroid.youtube.api;

import com.cursoandroid.youtube.model.Resultado;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YoutubeService {

    /*

    https://www.googleapis.com/youtube/v3/
    search
    ?part=snippet
    $order=date
    &maxResult=20
    &key=AIzaSyB_2Rtg4bDBnT2Nwm5VafxclRCOZDdGdv4
    &channelId=UCVHFbqXqoYvEWM1Ddxl0QDg
    &q=desenvolvimento+android

    https://www.googleapis.com/youtube/v3/search?part=snippet$order=date&maxResult=20&key=AIzaSyB_2Rtg4bDBnT2Nwm5VafxclRCOZDdGdv4&channelId=UCVHFbqXqoYvEWM1Ddxl0QDg

    * */

    @GET("search")
    Call<Resultado> recuperarVideos(
                    @Query("part") String part,
                    @Query("order") String order,
                    @Query("maxResult") String maxResult,
                    @Query("key") String key,
                    @Query("channelId") String channelId,
                    @Query("q") String q

    );

}
