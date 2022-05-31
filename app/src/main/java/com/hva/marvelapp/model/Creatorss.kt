package com.hva.marvelapp.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class Creatorss {
    var available:Int?=null
    var collectionURI:String?=null
    var items:ArrayList<Item>?=null
    var returned:Int?=null
}