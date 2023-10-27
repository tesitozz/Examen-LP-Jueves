package com.david.tercera.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class tercera {

    @GetMapping("/saludo")
    public String mostrarMensaje(Model model) {
        String mensaje = "Bienvenido al mundo de Spring con Java";
        model.addAttribute("saludo", mensaje);
        return "instituto";
    }

}
