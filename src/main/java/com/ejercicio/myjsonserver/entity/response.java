package com.ejercicio.myjsonserver.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class response {
    String codigo_respuesta = "";
    String mensaje = "";
    List<objeto> listaobjetos = new ArrayList<>();
}
