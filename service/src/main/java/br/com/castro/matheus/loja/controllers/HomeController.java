package br.com.castro.matheus.loja.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

    @RequestMapping("/")
    private void index() {
        System.out.println("Teste");
    }

    @RequestMapping("/teste")
    public List<String> teste() {
        ArrayList<String> resultList = new ArrayList<>();
        resultList.add("1");
        resultList.add("2");
        resultList.add("3");
        resultList.add("4");
        resultList.add("5");
        resultList.add("6");
        return resultList;
    }
}
