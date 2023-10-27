package com.david.tercera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.david.tercera.modelo.Producto;

@Controller
public class Codigo {
    @GetMapping("/producto/unico")
    public String mostrar(Model model) {
        Producto producto = new Producto();
        producto.setCodigo("P001");
        producto.setNombre("Arroz");
        producto.setPrecio(150);
        producto.setCantidad(1500);
        model.addAttribute("producto", producto);
        return "producto";

    }

}
