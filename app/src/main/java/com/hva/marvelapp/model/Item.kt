package com.hva.marvelapp.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
class Item:Serializable {
    var resourceURI:String?=null
    var name:String?=null
    var role:String?=null
}