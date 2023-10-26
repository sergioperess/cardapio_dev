package com.example.cardapio.food;

import org.springframework.data.jpa.repository.JpaRepository;

/*
    Ao utilizar o 'extends JpaRepository' teremos todos os métodos de acesso ao banco de dados, sem precisar implementar nada,
    herdando todos os métodos dessa classe Jpa.

    Necessário passar qual a entidade de consulta do repositório e qualo tipo do identificador único da entidade
    (nesse caso é o Id) 
 */

// Classe que se conecta com o bd para pegar os dados de la 
public interface FoodRepository extends JpaRepository<Food, Long> {

}
