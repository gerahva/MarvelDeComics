package com.hva.marvelapp

import java.io.InputStreamReader

class  MockFileReader(path: String) {
    val content: String
    init {
        val reader = InputStreamReader(this.javaClass.classLoader!!.getResourceAsStream(path))
        //   val reader = (this.javaClass.classLoader!!.getResource(path))
        content = reader.readText()
        reader.close()
    }
}