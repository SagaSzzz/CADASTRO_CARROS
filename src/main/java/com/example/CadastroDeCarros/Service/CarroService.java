package com.example.CadastroDeCarros.Service;


import com.example.CadastroDeCarros.Carro.CarroModel;
import com.example.CadastroDeCarros.Repository.CarroRepositorio;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarroService {


public final CarroRepositorio carroRepositorio;

    public CarroService(CarroRepositorio carroRepositorio) {

        this.carroRepositorio = carroRepositorio;
    }


    public List<CarroModel> getAll() {
        return carroRepositorio.findAll();}

public CarroModel save(CarroModel carro) {
        return carroRepositorio.save(carro);}


public void delete(Long id) {
    carroRepositorio.deleteById(id);}
}
