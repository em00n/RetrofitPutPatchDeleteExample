package com.emon.retrofitputpatchdeleteexample.retrofit;

import com.emon.retrofitputpatchdeleteexample.model.Post;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.PATCH;
import retrofit2.http.PUT;
import retrofit2.http.Path;


public interface JsonPlaceHolder {

    @PUT("posts/{id}")
    Call<Post> putPost(@Path("id") int id, @Body Post post);

    @PATCH("posts/{id}")
    Call<Post> patchPost(@Path("id") int id, @Body Post post);

    @FormUrlEncoded
    @PATCH("posts/{id}")
    Call<Post> patchPost(@Path("id") int id,@Field("title") String title);


    @DELETE("posts/{id}")
    Call<Void> deletePost(@Path("id") int id);

}
