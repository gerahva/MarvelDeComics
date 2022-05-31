package com.hva.marvelapp.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class Objectss {
    var type:String?=null
    var languaje:String?=null
    var text:String?=null
}