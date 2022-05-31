package com.hva.marvelapp.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
class Character:Serializable {
    var available:Int?=0
    var collectionURI:String?=null
    var items:ArrayList<Object>?=null
    var returned:Int?=null

}