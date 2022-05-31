package com.hva.marvelapp.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
class Datos:Serializable {
    var offset:Int?=null
    var limit:Int?=null
    var total:Int?=null
    var count: Int?=null
    var results:ArrayList<Comic>?=null

}