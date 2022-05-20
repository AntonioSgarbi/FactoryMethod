package tech.antoniosgarbi.pizza.impl;

import tech.antoniosgarbi.pizza.PizzaContrato;

public class ClamPizza implements PizzaContrato {
    @Override
    public void prepare() {
        System.out.println("""
                A pizza de moluscos pede ingrendientes diferenciados
                para harmonizar com os frutos do mar""");
    }

}