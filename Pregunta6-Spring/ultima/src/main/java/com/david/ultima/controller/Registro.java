package com.david.ultima.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import com.david.ultima.modelo.Regis;

@Controller
public class Registro {

    @GetMapping("/cliente/contacto")
    public String mostrarFormulario(Model model) {
        Regis regis = new Regis();
        regis.setCodigo("01");
        regis.setNombre("David");
        regis.setTelefono("984290861");
        regis.setDistrito("Comas");
        regis.setEdad(19);

        model.addAttribute("regis", regis);

        return "formulario";

    }

}
