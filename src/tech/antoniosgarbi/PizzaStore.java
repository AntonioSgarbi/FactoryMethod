package tech.antoniosgarbi;

import tech.antoniosgarbi.pizza.PizzaContrato;

public class PizzaStore {
    PizzaContrato orderPizza(String type) throws Exception {
        PizzaContrato pizza = PizzaFactory.orderPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
}