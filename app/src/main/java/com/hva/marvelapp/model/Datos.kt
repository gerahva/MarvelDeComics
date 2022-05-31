package com.hva.marvelapp.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class Datos {
    var offset:Int?=null
    var limit:Int?=null
    var total:Int?=null
    var count: Int?=null
    var results:ArrayList<Comic>?=null

}