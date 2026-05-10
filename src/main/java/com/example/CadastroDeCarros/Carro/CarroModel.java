package com.example.CadastroDeCarros.Carro;

import com.example.CadastroDeCarros.Pessoa.PessoaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_carros")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int ano;
    private int valor;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private PessoaModel pessoa;


}
