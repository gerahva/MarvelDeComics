package com.hva.marvelapp


import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before
import org.mockito.MockitoAnnotations
import java.net.HttpURLConnection

class ApiTesting {

    val TS="1"
    val API_KEY="bbb17f6d05cc608e3eb2da3152061c90"
    val HASH="e25b46f76602bf44cd88bb2608e2eafa"

    var mockWebServer:MockWebServer?=null

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        mockWebServer = MockWebServer()
        mockWebServer?.start()
    }



    @Test
    fun `leer muestra o mocking del json del request`(){

        var  mockedResponse = MockFileReader("success_response.json").content

        assertNotNull(mockedResponse)
    }


    //Probamos que la respuesta del servidor sea igual a la del mock
    @Test
    fun `leer y contrastar del json del request`(){

        // Servidor mocking
        val response = MockResponse()
            .setResponseCode(HttpURLConnection.HTTP_OK)
            .setBody(MockFileReader("success_response.json").content)
        mockWebServer?.enqueue(response)

        //Servidor real
        val characterMarvel = ClienteAPI.getApi()?.getCharacterMarvel(
            TS,
            API_KEY,
            HASH
        )?.execute()?.body()!!

        assertEquals(response.toString().contains("200"),
            characterMarvel.code.toString().contains("200"))

    }


}