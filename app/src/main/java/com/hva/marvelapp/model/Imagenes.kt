package com.hva.marvelapp.model
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.io.InputStream
import java.net.URL

class Imagenes {
    companion object{
        fun obtenerImagen( urlNombre:String): Bitmap? {


            val  url= URL("${urlNombre}.jpg")
            return BitmapFactory.decodeStream(url.openConnection().getInputStream())

        }
    }
}