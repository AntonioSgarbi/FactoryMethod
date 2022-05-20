package tech.antoniosgarbi.pizza.impl;

import tech.antoniosgarbi.pizza.PizzaContrato;

public class CheesePizza implements PizzaContrato {
    @Override
    public void box() {
        System.out.println(""" 
                A pizza de queijo é enxaixotada de de forma a
                garantir que o recheio não grunde na tampa""");
    }

}