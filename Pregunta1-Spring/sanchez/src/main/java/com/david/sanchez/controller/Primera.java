package com.david.sanchez.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Primera {
    @GetMapping(value = "/")
    public String saludo() {
        return "Examen de Laboratorio 2 - David Aaron Sanchez";
    }

}
