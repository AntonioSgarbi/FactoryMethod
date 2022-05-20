package tech.antoniosgarbi;

import tech.antoniosgarbi.pizza.PizzaContrato;
import tech.antoniosgarbi.pizza.impl.CheesePizza;
import tech.antoniosgarbi.pizza.impl.GreeyPizza;
import tech.antoniosgarbi.pizza.impl.PepperoniPizza;

public abstract class PizzaFactory {

    public static PizzaContrato orderPizza(String type) throws Exception {
        PizzaContrato pizza = null;

        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "greey":
                pizza = new GreeyPizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            default:
                throw new Exception("Sabor não identificado, tente novamente!");
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}