package com.example.pacoteentrega.data.source.remote.repositorio.usuario

import com.example.pacoteentrega.data.source.remote.models.request.UsuarioModelResquest
import com.example.pacoteentrega.data.source.remote.models.response.UsuarioModel
import retrofit2.Call
import retrofit2.http.*

interface UsuarioService {
    @POST("{urlBase}api/Usuario/BuscarUsuarioLogin")
    fun buscarUsuarioLogin(
        @Body modelo: UsuarioModelResquest,
        @Header("Authorization") authorization : String,
        @Path("urlBase", encoded = true) urlbase: String = Rotas.URL_BASE_PROVEDOR
    ) : Call<UsuarioModel>
}

class Rotas {
    companion object {
        val URL_BASE_PROVEDOR = "http://vendaprovedordados.dev.havan.com.br/"
    }
}