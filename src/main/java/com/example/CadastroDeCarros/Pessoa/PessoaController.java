package com.example.CadastroDeCarros.Pessoa;

import com.example.CadastroDeCarros.Repository.PessoaRepositorio;
import com.example.CadastroDeCarros.Service.CarroService;
import com.example.CadastroDeCarros.Service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class PessoaController {


    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }


    @GetMapping
    public List<PessoaModel> getAll() {
        return pessoaService.getAll();
    }
    @PostMapping
    public PessoaModel create(@RequestBody PessoaModel pessoa){
        return pessoaService.save(pessoa);
    }

}