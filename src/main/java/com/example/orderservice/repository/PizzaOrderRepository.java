package com.example.orderservice.repository;

import com.example.orderservice.entities.PizzaOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaOrderRepository extends JpaRepository<PizzaOrder, Long> {


}
