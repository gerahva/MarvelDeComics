package com.hva.marvelapp


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.hva.marvelapp.model.Comic

class FragmentLista : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        val view=inflater.inflate(R.layout.fragment_lista, container, false)
        val comicAdapter=ComicAdapter{comic ->adapterOnClick(comic, view) }

        val recyclerView: RecyclerView =view.findViewById(R.id.recycler_view)
        recyclerView.adapter=comicAdapter

        comicAdapter.submitList(SplashScreenActivity.comics)



        return view
    }

    fun adapterOnClick(comic: Comic, view :View ) {
        //Aqui tendriamos que inyectarle ora vista para que nos lleve a esa vista

       Log.i("XY","el nombre es ${comic.title}")
        //Esta accion es por el safe args que agregamos para hacer mas segura el cccc
        //paso de argumentos de un fragment (FragmentLista) a otro (FragmentDetalles)
        //La clase Directions se autogenera al agregar el argumento de tipo Character
        //que agregamos en el layout del fragment_detalles
        val accion=FragmentListaDirections.actionFragmentListaToFragmentDetalles(comic)
        view.findNavController().navigate(accion)
    }


}