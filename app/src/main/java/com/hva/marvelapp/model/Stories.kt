package com.hva.marvelapp.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.hva.marvelapp.model.MarvelItem
import java.io.Serializable
@JsonIgnoreProperties(ignoreUnknown = true)
class Stories:Serializable {
    var available:Int?=null
    var returned:Int?=null
    var collectionURI:String?=null
    var items:ArrayList<MarvelItem>?=null
}