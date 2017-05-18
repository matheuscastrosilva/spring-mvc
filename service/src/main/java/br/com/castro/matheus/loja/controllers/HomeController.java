package br.com.castro.matheus.loja.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    private void showValue(){
        System.out.println("Oi.");
    }
}
