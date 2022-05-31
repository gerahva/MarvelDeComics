package com.hva.marvelapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.hva.marvelapp.model.Comic
import com.squareup.picasso.Picasso

class ComicAdapter(private val onClick:(Comic)->Unit):
    ListAdapter<Comic, ComicAdapter.ComicViewHolder>(ComicCallback){


        class ComicViewHolder(itemView: View, val onClick:(Comic)->Unit ):
                RecyclerView.ViewHolder(itemView){
                    private val title_v: TextView =itemView.findViewById<TextView>(R.id.title_tv)
                    private val series_v=itemView.findViewById<TextView>(R.id.series_tv)
                    private val stories_v=itemView.findViewById<TextView>(R.id.stories_tv)
                    private val events_v=itemView.findViewById<TextView>(R.id.events_tv)


                   //Imagen
                   private val imageView=itemView.findViewById<ImageView>(R.id.imageView)

            //Model a "adaptar"
            private var comicActual: Comic?=null
            init {
                itemView.setOnClickListener {
                    comicActual?.let {
                        onClick(it)
                    }
                }
            }//Termina init

            fun enlazar(comic: Comic){
                comicActual=comic
                //Asignamos sus valores
                title_v.text=comicActual?.title
                series_v.text="Serie: ${comicActual?.series?.name}"
                stories_v.text="Stories: ${comicActual?.stories?.items?.size}"
                events_v.text="Event: ${comicActual?.events?.items?.size}"


                //sacamos los valores del thumbnail del modelo que llega a la
                //Imagen
                val url=   comicActual?.thumbnail?.path+".jpg"
                var urlnueva= url.replace("http","https", true)
                //  Usamos la biblioteca de Picassso para ajustar las thumbnails
               Picasso.get().load(urlnueva)
                    .resize(280,280)
                    .into(imageView);
//Actuali
                    }

                } //Termina clas viewholder
//Sobreescribimos los siguientes dos metodos de RecyclerView.Adapter
    override fun onBindViewHolder(holder: ComicViewHolder, position: Int) {
        val character=getItem(position)
    //URL de la imagen
 //val url=   character.thumbnail?.path+".jpg"
   // Picasso.get().load(url).into(  holder.itemView.findViewById<ImageView>(R.id.imageView))
       holder.enlazar(character)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComicViewHolder {
       val view=LayoutInflater.from(parent.context)
           .inflate(R.layout.character_item,parent,false)
        return  ComicViewHolder(view, onClick)

    }

}//Termina ComicAdapter

//Implementamos la clase ComicCallback
object  ComicCallback:DiffUtil.ItemCallback<Comic>(){
    override fun areItemsTheSame(oldItem: Comic, newItem: Comic): Boolean {
        return oldItem==newItem
    }

    override fun areContentsTheSame(oldItem: Comic, newItem: Comic): Boolean {
      return oldItem.id==newItem.id
    }


}