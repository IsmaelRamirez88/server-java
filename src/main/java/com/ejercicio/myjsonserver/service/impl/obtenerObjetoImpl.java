package com.ejercicio.myjsonserver.service.impl;

import com.ejercicio.myjsonserver.entity.response;
import com.ejercicio.myjsonserver.entity.objeto;
import com.ejercicio.myjsonserver.service.obtenerObjetoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class obtenerObjetoImpl implements obtenerObjetoService {
    @Override
    public response ObtenerObjeto(){
        String Codigo_Respuesta = "";
        String Mensaje = "";
        response Respuesta = new response();
        try {
            List<objeto> listaObjeto = new ArrayList<>();
            objeto Objeto = new objeto("carro", "Grande", "Green");
            listaObjeto.add(Objeto);
            objeto Objeto2 = new objeto("moto", "mediana", "Blue");
            listaObjeto.add(Objeto2);
            objeto Objeto3 = new objeto("bicicleta", "chica", "Green");
            listaObjeto.add(Objeto3);
            objeto Objeto4 = new objeto("avion", "grande", "yellow");
            listaObjeto.add(Objeto4);
            if(listaObjeto.size()>0){
                Respuesta.setListaobjetos(listaObjeto);
                Codigo_Respuesta = "0";
                Mensaje = "Ok";
            }
        }catch (Exception ex){
            Codigo_Respuesta = "-1";
            Mensaje = "Error";
        }
        Respuesta.setCodigo_respuesta(Codigo_Respuesta);
        Respuesta.setMensaje(Mensaje);
        return Respuesta;
    }
}
