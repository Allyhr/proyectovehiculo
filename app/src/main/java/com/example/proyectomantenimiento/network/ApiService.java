package com.example.proyectopruebaa.network;

import com.example.proyectopruebaa.modelos.Color;
import com.example.proyectopruebaa.modelos.Marca;
import com.example.proyectopruebaa.modelos.Modelo;
import com.example.proyectopruebaa.modelos.Usuario;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {

    // Ya tienes esto:
    @POST("api/autenticacion/login")
    Call<ResponseBody> login(@Body Usuario usuario);

    @POST("api/autenticacion/registro")
    Call<ResponseBody> registrar(@Body Usuario usuario);

    // 🔽 Agrega esto para obtener catálogos

    @GET("api/catalogos/marcas")
    Call<List<Marca>> getMarcas();

    @GET("api/catalogos/modelos")
    Call<List<Modelo>> getModelos();

    @GET("api/catalogos/colores")
    Call<List<Color>> getColores();
}