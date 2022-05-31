package com.hva.marvelapp

import com.hva.marvelapp.model.MarvelComics
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ClienteAPI {


  // @GET("v1/public/comics?ts=1&apikey=bbb17f6d05cc608e3eb2da3152061c90&hash=e25b46f76602bf44cd88bb2608e2eafa")
    @GET("v1/public/comics")
   fun getMarvelComic(@Query("ts") ts:String, @Query("apikey") apiKey:String, @Query("hash") hash:String): Call<MarvelComics>


    companion object {

        val BASE_URL = "https://gateway.marvel.com/"
        var retrofit: Retrofit? = null

        fun getApi(): ClienteAPI? {
            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(JacksonConverterFactory.create())
                    .build()
            }
            return retrofit?.create(ClienteAPI::class.java)
        }
    }
 }

