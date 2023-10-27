package com.david.quinta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

import com.david.quinta.modelo.Estudiantes;

@Controller
public class Estudiantee {

    @GetMapping("/estudiantes/lista")
    public String mostrarEstudiantes(Model model) {
        List<Estudiantes> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiantes("Alum001", "Carlos", "LP2", 18));
        estudiantes.add(new Estudiantes("Alum002", "Karla", "LP1", 15));
        estudiantes.add(new Estudiantes("Alum093", "Miguel", "LP2", 20));

        model.addAttribute("estudiantes", estudiantes);

        return "estudiantes";

    }

}
