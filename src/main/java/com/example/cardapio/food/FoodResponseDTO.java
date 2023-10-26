package com.example.cardapio.food;

public record FoodResponseDTO(String title, String image, Integer price) {
    public FoodResponseDTO(Food food) {
        this(food.getTitle(), food.getImage(), food.getPrice());
    }
}
