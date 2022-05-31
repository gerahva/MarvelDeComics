package com.hva.marvelapp.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
class Dates:Serializable {
  var type:String?=null
  var  date:String?=null
}