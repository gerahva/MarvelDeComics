package com.hva.marvelapp.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
class MarvelComics {
   var code:Int?=null
   var status:String?=null
    var copyright:String?=null
    var attributionText:String?=null
    var attributionHtml:String?=null
    var etag:String?=null
   var data: Datos?=null



}