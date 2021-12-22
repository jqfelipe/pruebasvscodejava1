package com.springvs.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TramaController {
    @GetMapping("/Consulta")
    public String Consultar(){
        return "Sitio Ok";
    }
    @PostMapping("/api/Procesar")
    public String ProcesarTrama(String tramaEntrada){
        String tramaSalida = "";
        return tramaSalida;
    }
}
