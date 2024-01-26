package com.pedro_marin_sanchis.nomnomnectar.controller;

import com.pedro_marin_sanchis.nomnomnectar.model.AppUser;
import com.pedro_marin_sanchis.nomnomnectar.service.order.IOrderService;
import com.pedro_marin_sanchis.nomnomnectar.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app/order")
public class OrderController {

    private final IOrderService orderService;
    private final IUserService userService;

    @Autowired
    public OrderController(IOrderService orderService, IUserService userService) {
        this.orderService = orderService;
        this.userService = userService;
    }

    @GetMapping("/list")
    public String getMenuList(Model model) {
        AppUser user = userService.getCurrentUser().get(); // Get current user.

        if (user != null) {
            model.addAttribute("user", user);
            model.addAttribute("orders", orderService.getOrdersByUserId(user.getId()));
            return "/app/order/order_list";
        } else {
            return "redirect:/login";
        }
    }
}
