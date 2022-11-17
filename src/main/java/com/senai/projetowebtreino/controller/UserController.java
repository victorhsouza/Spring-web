package com.senai.projetowebtreino.controller;


import com.senai.projetowebtreino.model.UserModel;

import com.senai.projetowebtreino.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/usuarios" )
public class UserController {

    @Autowired
    private UserService userService;

//    @Autowired
//    private UserRepository userRepository;

    @GetMapping
    public String getAllUsers(Model model){
        List<UserModel> users = userService.findAll();
        model.addAttribute("users", users);
        return "user/usuarios";
    }

    @GetMapping(value = "/novo")
    public String formUser(){
        return "user/novo";
    }

    @PostMapping(value = "/cadastrar")
    public String insertUser(UserModel userModel){
        userService.save(userModel);
        return "redirect:/usuarios";
    }

    @DeleteMapping(value = "/{id}/excluir")
    public String deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
        return "redirect:/usuarios";
    }
}
