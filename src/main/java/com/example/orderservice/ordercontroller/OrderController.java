package com.example.orderservice.ordercontroller;

import com.example.orderservice.entities.PizzaOrder;
import com.example.orderservice.repository.PizzaOrderRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    private final PizzaOrderRepository orderRepository;

    public OrderController(PizzaOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/orders")
    public List<PizzaOrder> getOrders() {
        return orderRepository.findAll();
    }


    @PostMapping("/orders")
    public void newOrder(@RequestBody PizzaOrder pizzaOrder) {
        orderRepository.save(pizzaOrder);
    }

}
