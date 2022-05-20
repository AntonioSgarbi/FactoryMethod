package tech.antoniosgarbi.pizza.impl;

import tech.antoniosgarbi.pizza.PizzaContrato;

public class VeggiePizza implements PizzaContrato {
    @Override
    public void bake() {
        System.out.println("""
                 A pizza veggie é assada de forma diferente
                para manter a textura dos legumes""");
    }

}