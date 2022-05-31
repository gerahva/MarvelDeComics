package com.hva.marvelapp.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.hva.marvelapp.model.MarvelItem
import java.io.Serializable
@JsonIgnoreProperties(ignoreUnknown = true)
class Series {
  var resourceURI:String?=null
  var name:String?=null

}