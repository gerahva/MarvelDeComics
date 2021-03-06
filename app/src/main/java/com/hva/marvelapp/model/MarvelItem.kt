package com.hva.marvelapp.model

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
class MarvelItem:Serializable {
    var resourceURI:String?=null
    var name:String?=null
    var type:String?=null
}