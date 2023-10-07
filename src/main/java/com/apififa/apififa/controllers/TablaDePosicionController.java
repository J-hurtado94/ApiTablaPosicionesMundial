package com.apififa.apififa.controllers;


import com.apififa.apififa.models.TablaDePosiciones;
import com.apififa.apififa.services.TablaDePosicionesServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/grupos")
public class TablaDePosicionController {

    private final TablaDePosicionesServicio tablaDePosicionesServicio;

    public TablaDePosicionController(TablaDePosicionesServicio tablaDePosicionesServicio) {
        this.tablaDePosicionesServicio = tablaDePosicionesServicio;
    }

    @GetMapping("/{idGrupo}/posiciones")

    public List<TablaDePosiciones> listarEquipos(@PathVariable int idGrupo) {
        return tablaDePosicionesServicio.listarPosiciones(idGrupo);
    }
}
