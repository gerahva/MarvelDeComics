package com.hva.marvelapp

import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

//Fragmento
class FragmentDetalles : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view=inflater.inflate(R.layout.fragment_detalles, container, false)

        //Pedimos elargumento de tipo Character que viene del FragmentoLista es este
        val comic=FragmentDetallesArgs.fromBundle(requireArguments()).comic

        //Asignamos a las vistas del detalle Los atrbutos
     val detalles_name=view.findViewById<TextView>(R.id.detalles_name_tv)
        detalles_name.text=comic.title
     val detalles_thumbnail=view.findViewById<ImageView>(R.id.detalle_thumbnail_mv)
        val url=   comic?.thumbnail?.path+".jpg"

       var urlnueva= url.replace("http","https", true)

     val detalles_description=view.findViewById<TextView>(R.id.detalle_description_tv)
           detalles_description.text=comic.description


        //  Usamos la biblioteca de Picassso para ajustar las thumbnails
       Picasso.get().load(urlnueva)
            .into(detalles_thumbnail);



        return view
    }


}