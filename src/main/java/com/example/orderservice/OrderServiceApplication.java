package com.example.orderservice;

import com.example.orderservice.repository.PizzaOrderRepository;
import com.example.orderservice.entities.PizzaOrder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(PizzaOrderRepository pizzaOrderRepository) {
        return (args) -> {

            if (pizzaOrderRepository.count() == 0) {
                pizzaOrderRepository.save(new PizzaOrder(1L, "Jonas", "0763408094", "Calzone", 89));

            }


        };

    }
}
