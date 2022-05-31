package com.hva.marvelapp.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
class Creatorss:Serializable {
    var available:Int?=null
    var collectionURI:String?=null
    var items:ArrayList<Item>?=null
    var returned:Int?=null
}