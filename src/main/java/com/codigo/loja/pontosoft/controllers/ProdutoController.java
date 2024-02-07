package com.codigo.loja.pontosoft.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProdutoController{

    @GetMapping("/teste")
    @ResponseBody
    public String testeController(){
        return "<h1>ISSO É UM TESTE!</h1>";
    }

}
