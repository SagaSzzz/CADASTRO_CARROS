package com.example.CadastroDeCarros.Repository;

import com.example.CadastroDeCarros.Pessoa.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepositorio extends JpaRepository <PessoaModel, Long>{
}
