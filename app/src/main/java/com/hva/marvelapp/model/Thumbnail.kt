package com.hva.marvelapp.model
//Imagen
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable
@JsonIgnoreProperties(ignoreUnknown = true)
class Thumbnail:Serializable {
    var path:String?=null
    var extension:String?=null
}