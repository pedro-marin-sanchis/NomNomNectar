package com.pedro_marin_sanchis.nomnomnectar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/login")
    public String getLogin(Model model) {
        model.addAttribute("user", null);
        return "/auth/auth_login";
    }

    @GetMapping("logout")
    public String getLogout(Model model) {
        model.addAttribute("user", null);
        return "/auth/auth_logout";
    }

}
