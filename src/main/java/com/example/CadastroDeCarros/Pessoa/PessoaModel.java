package com.example.CadastroDeCarros.Pessoa;

import com.example.CadastroDeCarros.Carro.CarroModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "tb_cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Long Cpf;
    private String email;

    @OneToMany(mappedBy = "pessoa")
    private List<CarroModel>carros;


}
