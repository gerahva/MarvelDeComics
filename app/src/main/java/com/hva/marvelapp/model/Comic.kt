package com.hva.marvelapp.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable
import java.util.*
import kotlin.collections.ArrayList

@JsonIgnoreProperties(ignoreUnknown = true)
class Comic:Serializable {
    var id :Int?=null
    var digitalId:Int?=null
    var title:String?=null
    var issueNumber:Int?=0
    var variantDescription:String?=null
    var description:String?=null
    var modified:String?=null
    var isbn:String?=null
    var upc:String?=null
    var diamondCode:String?=null
    var ean:String?=null
    var issn:String?=null
    var format:String?=null
    var pageCount:Int?=null
    var textObjects:ArrayList<Objectss>?=null
    var resourceURI:String?=null
    var urls:ArrayList<ComicUrl>?=null
    var series:Series?=null
    var variants:ArrayList<Series>?=null
    var collections:ArrayList<Series>?=null
    var collectedIssues:ArrayList<Series>?=null
    var dates:ArrayList<Dates>?=null
    var prices:ArrayList<Price>?=null
    var thumbnail:Thumbnail?=null
    var images:ArrayList<Thumbnail>?=null
    var creators:Creatorss?=null
    var characters:Character?=null
    var stories:Stories?=null
    var events:Events?=null

}