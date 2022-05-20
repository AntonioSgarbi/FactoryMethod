package tech.antoniosgarbi.pizza.impl;

import tech.antoniosgarbi.pizza.PizzaContrato;

public class GreeyPizza implements PizzaContrato {
    @Override
    public void prepare() {
        throw new RuntimeException(
                "Esse sabor não está disponível, selecione outro.");
    }

}