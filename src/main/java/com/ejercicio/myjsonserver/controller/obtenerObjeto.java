package com.ejercicio.myjsonserver.controller;

import com.ejercicio.myjsonserver.entity.objeto;
import com.ejercicio.myjsonserver.entity.response;
import com.ejercicio.myjsonserver.service.obtenerObjetoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping(value = "/controller")
public class obtenerObjeto {
    @Autowired
    obtenerObjetoService obtenerobjeto;

    @GetMapping(value = "/obtenerobjeto", produces = "application/json; charset=UTF-8")
    public response ObtenerObjeto(){
        response response = new response();
        response = obtenerobjeto.ObtenerObjeto();
        return response;
    }
}
