package com.example.cardapio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// Mapeando o controller que vai para a aplicação
import org.springframework.web.bind.annotation.RequestMapping;
// Controller da aplicação
import org.springframework.web.bind.annotation.RestController;

import com.example.cardapio.food.Food;
import com.example.cardapio.food.FoodRepository;
import com.example.cardapio.food.FoodRequestDTO;
import com.example.cardapio.food.FoodResponseDTO;

// Requests para pegar os dados do cardapio e adicionar novas informações no banco de dados
@RestController
// Todo request que for pro endpoint (food)
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    // Método chamado quando o endpoint for chamado
    // Método para pegar todos os dados dentro da tabela food
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll() {
        // Transforma a entidade em um tipo DTO
        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }

    // Mostrar pro spring que são as requisições do tipo post
    // Enviar dados
    // DTO -> Data Transfer Object
    // FoodRequestDTO -> dado que chega do cliente
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data) {
        Food foodData = new Food(data);
        repository.save(foodData);
    }
}
