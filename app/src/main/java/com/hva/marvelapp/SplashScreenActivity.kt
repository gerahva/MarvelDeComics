package com.hva.marvelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.hva.marvelapp.model.Comic
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class SplashScreenActivity : AppCompatActivity() {




        val TS="1"
        val API_KEY="bbb17f6d05cc608e3eb2da3152061c90"
        val HASH="e25b46f76602bf44cd88bb2608e2eafa"
    companion object{


        var comics:ArrayList<Comic>?=null

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  setContentView(R.layout.activity_splash_screen)

        GlobalScope.launch(Dispatchers.IO){

        val marvelComics = ClienteAPI.getApi()?.getMarvelComic(
            TS,
            API_KEY,
            HASH
        )?.execute()?.body()!!

            //Los characters los obtenemos
          comics=marvelComics.data?.results!!

         Log.i("XY",  "total ${marvelComics.code}")





                    //Asignamos el atributo
                   // misCharacters=lista



           startActivity(Intent(this@SplashScreenActivity, MainActivity::class.java))
           finish()

        }








    }
}