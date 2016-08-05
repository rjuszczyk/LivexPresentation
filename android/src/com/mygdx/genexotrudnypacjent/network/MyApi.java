package com.mygdx.genexotrudnypacjent.network;

import com.mygdx.genexotrudnypacjent.model.RowResponse;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by Radek on 2016-02-26.
 */
public interface MyApi {
    @GET("baza_aptek/baza_aptek1.php")
    Call<RowResponse> rows();
}
