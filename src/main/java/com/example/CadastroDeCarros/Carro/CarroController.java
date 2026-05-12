package com.example.CadastroDeCarros.Carro;


import com.example.CadastroDeCarros.Service.CarroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {


 private final CarroService carroService;

    public CarroController(CarroService carroService) {
        this.carroService = carroService;
    }


    @GetMapping
    public List<CarroModel> getAll() {return carroService.getAll();}

    @PostMapping
    public CarroModel create(@RequestBody CarroModel carro) {return carroService.save(carro);}

}
