package com.hva.marvelapp.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class Item {
    var resourceURI:String?=null
    var name:String?=null
    var role:String?=null
}