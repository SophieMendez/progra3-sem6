package com.semana6.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/intro")
public class WebConroller {

    @GetMapping() // devuelve el "servidor en linea web"
    public String index() {
        return "index";
    }

    
}
