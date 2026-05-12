package com.example.CadastroDeCarros.Pessoa;

import com.example.CadastroDeCarros.Carro.CarroModel;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    private Long cpf;
    private String email;

    @JsonManagedReference
    @OneToMany(mappedBy = "pessoa")
    private List<CarroModel>carros;
}
