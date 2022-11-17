package com.senai.projetowebtreino.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/" )
public class HomeController {

    @GetMapping
    public String index(Model model){
        model.addAttribute("nome", "Victor");
        return "home/index";
    }

}
