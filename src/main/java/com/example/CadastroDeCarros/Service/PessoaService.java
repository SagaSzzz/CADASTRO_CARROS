package com.example.CadastroDeCarros.Service;

import com.example.CadastroDeCarros.Pessoa.PessoaModel;
import com.example.CadastroDeCarros.Repository.PessoaRepositorio;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class PessoaService {

    private final PessoaRepositorio pessoaRepositorio;

    public PessoaService(PessoaRepositorio pessoaRepositorio) {
        this.pessoaRepositorio = pessoaRepositorio;
    }

public List<PessoaModel> getAll(){
        return pessoaRepositorio.findAll();
}

    public PessoaModel save(PessoaModel pessoa){
        return pessoaRepositorio.save(pessoa);
    }
 public void delete(Long id) {
        pessoaRepositorio.deleteById(id);
 }

}
