package com.hva.marvelapp.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
class Price:Serializable {
    var type:String?=null
    var price:Int?=null
}