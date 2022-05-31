package com.hva.marvelapp.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class Price {
    var type:String?=null
    var price:Int?=null
}