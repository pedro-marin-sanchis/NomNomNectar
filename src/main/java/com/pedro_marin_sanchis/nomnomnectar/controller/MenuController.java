package com.pedro_marin_sanchis.nomnomnectar.controller;

import com.pedro_marin_sanchis.nomnomnectar.model.AppUser;
import com.pedro_marin_sanchis.nomnomnectar.model.Menu;
import com.pedro_marin_sanchis.nomnomnectar.service.menu.IMenuService;
import com.pedro_marin_sanchis.nomnomnectar.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/app/menu")
public class MenuController {

    private final IMenuService menuService;
    private final IUserService userService;

    @Autowired
    public MenuController(IMenuService menuService, IUserService userService) {
        this.menuService = menuService;
        this.userService = userService;
    }

    @GetMapping("/list")
    public String getMenuList(Model model) {
        AppUser user = userService.getCurrentUser().get(); // Get current user.

        if (user != null) {
            model.addAttribute("user", user);
            List<Menu> menus = menuService.getAllMenus();
            model.addAttribute("menus", menus);
            return "/app/menu/menu_list";
        } else {
            return "redirect:/login";
        }
    }

    @GetMapping("/detail/{id}")
    public String getMenuDetail(@PathVariable("id") Long id, Model model) {
        AppUser user = userService.getCurrentUser().get(); // Get current user.

        if (user != null) {
            model.addAttribute("user", user);
            Menu menu = menuService.getMenuById(id).get();
            model.addAttribute("menu", menu);
            return "/app/menu/menu_detail";
        } else {
            return "redirect:/login";
        }
    }

}