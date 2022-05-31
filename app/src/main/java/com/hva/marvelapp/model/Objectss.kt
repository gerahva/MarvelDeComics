package com.hva.marvelapp.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
class Objectss:Serializable {
    var type:String?=null
    var languaje:String?=null
    var text:String?=null
}