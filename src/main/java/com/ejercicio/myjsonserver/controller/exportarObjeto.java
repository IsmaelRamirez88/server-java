package com.ejercicio.myjsonserver.controller;

import com.ejercicio.myjsonserver.entity.response;
import com.ejercicio.myjsonserver.service.obtenerObjetoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.apache.bcel.generic.ObjectType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.json.JSONObject;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping(value = "/controller")
public class exportarObjeto {
    @Autowired
    obtenerObjetoService obtenerobjeto;

    @GetMapping(value = "/exportarobjeto", produces = "application/json")
    public ResponseEntity<InputStreamResource> exportarobjeto(String nombreArchivo)
            throws IOException {
        response response = new response();
        //String usuarioJson = "";
        ObjectMapper objectMapper = new ObjectMapper();
        response = obtenerobjeto.ObtenerObjeto();
        System.out.println(response);
        byte[] buf = objectMapper.writeValueAsBytes(response);

        return ResponseEntity
                .ok()
                .contentLength(buf.length)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + nombreArchivo + ".json")
                .contentType(
                        MediaType.parseMediaType("application/octet-stream"))
                .body(new InputStreamResource(new ByteArrayInputStream(buf)));
    }
}
