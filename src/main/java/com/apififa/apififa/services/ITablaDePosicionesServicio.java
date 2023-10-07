package com.apififa.apififa.services;

import com.apififa.apififa.models.TablaDePosiciones;

import java.util.List;

public interface ITablaDePosicionesServicio {

 List<TablaDePosiciones> listarPosiciones(int idGrupo);
}
