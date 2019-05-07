package com.example.retail;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clients")
public class ClientsController {

    @GetMapping
    public String showRegisterForm(Model model) {
        model.addAttribute("client", new Client());
        return "register-client";
    }

    @PostMapping
    public String register(Client client) {
       System.out.println("Registered" + client);
       return "client-registered";
    }

}