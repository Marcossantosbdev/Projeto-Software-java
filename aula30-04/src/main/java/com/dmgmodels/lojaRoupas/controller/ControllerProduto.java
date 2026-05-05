package com.dmgmodels.lojaRoupas.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/roupa")

public class  ControllerProduto {
    @PostMapping
    public void cadastrarProduto (@RequestBody String produto){
        System.out.println(produto);
    }
}
