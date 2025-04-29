package ir.iraniancyber.taghcheiraniancyber.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/allProduct")
    public String allProduct() {
        return "allProducts";
    }

    @GetMapping("/product")
    public String product() {
        return "product";
    }

    @GetMapping("/productList")
    public String productList() {
        return "productList";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/saveProduct")
    public String saveProduct() {
        return "productSave";
    }
}
