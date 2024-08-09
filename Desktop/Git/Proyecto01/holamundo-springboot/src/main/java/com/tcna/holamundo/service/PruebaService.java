package com.tcna.holamundo.service;

import com.tcna.holamundo.request.Empleado;
import com.tcna.holamundo.request.Respuesta;
import org.springframework.stereotype.Service;

@Service
public class PruebaService {



    public Respuesta ejemploService(Empleado empleado) {
        Respuesta respuesta = new Respuesta();
        respuesta.setResponse("El puesto es: " + empleado.getPuesto() + " El salario es: " + empleado.getSalario());
        return respuesta;
    }
}
