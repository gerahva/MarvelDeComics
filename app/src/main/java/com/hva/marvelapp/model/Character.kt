package com.hva.marvelapp.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class Character {
    var available:Int?=0
    var collectionURI:String?=null
    var items:ArrayList<Object>?=null
    var returned:Int?=null

}