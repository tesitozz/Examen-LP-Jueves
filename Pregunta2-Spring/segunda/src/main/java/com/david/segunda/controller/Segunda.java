package com.david.segunda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Segunda {
    @GetMapping(value = "/")
    public String home() {
        return "index";
    }

}
