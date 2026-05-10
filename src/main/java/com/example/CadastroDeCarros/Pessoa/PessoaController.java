package com.example.CadastroDeCarros.Pessoa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oi")
public class PessoaController {


    @GetMapping
    public String falar(){
        return "OI";
    }





}
