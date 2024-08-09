package com.tcna.holamundo.controller;

import com.tcna.holamundo.request.Empleado;
import com.tcna.holamundo.request.Respuesta;
import com.tcna.holamundo.service.PruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping ("/controller")
public class Controller1 {

    @Autowired
    private PruebaService service;

    @GetMapping
    public String mostrarMensaje3(){
        return"Hola Mundo por defecto";
    }

    @GetMapping("/holamundo1")
    @ResponseBody
    public String mostrarMensaje1(){
        return "Hola Mundo en Spring Boot 1";

    }

    @GetMapping("/holamundo2")
    @ResponseBody
    public String mostrarMensaje2(){
        return "Hola Mundo en Spring Boot 2";


    }

    @PostMapping("/empleado")
    @ResponseBody
    public Respuesta recibirEmpleado(@RequestBody Empleado empleado) {
        return service.ejemploService(empleado);
    }



}
