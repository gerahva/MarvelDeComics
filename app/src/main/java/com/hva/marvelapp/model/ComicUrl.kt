package com.hva.marvelapp.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable
@JsonIgnoreProperties(ignoreUnknown = true)
class ComicUrl:Serializable {
    var type:String?=null
    var url:String?=null
}