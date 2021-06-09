package com.example.covidapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MyInterface {
    @GET("dayone/country/{input}")  //curly braces are for required data in the link (dynamic value)
    Call<String> getValue(@Path("input") String i);

}
