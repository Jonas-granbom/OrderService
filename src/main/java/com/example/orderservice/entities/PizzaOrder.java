package com.example.orderservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PizzaOrder {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String customerName;
    private String customerPhone;
    private String orderedPizza;
    private int costOfPizza;

    public PizzaOrder() {
    }

    public PizzaOrder(Long id, String customerName, String customerPhone, String orderedPizza, int costOfPizza) {
        this.id = id;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.orderedPizza = orderedPizza;
        this.costOfPizza = costOfPizza;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getOrderedPizza() {
        return orderedPizza;
    }

    public void setOrderedPizza(String orderedPizza) {
        this.orderedPizza = orderedPizza;
    }

    public int getCostOfPizza() {
        return costOfPizza;
    }

    public void setCostOfPizza(int costOfPizza) {
        this.costOfPizza = costOfPizza;
    }
}
