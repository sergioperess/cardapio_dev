package com.example.cardapio.food;

public record FoodRequestDTO(Long id, String title, String image, Integer price) {
    public FoodRequestDTO(Food food) {
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }

}
