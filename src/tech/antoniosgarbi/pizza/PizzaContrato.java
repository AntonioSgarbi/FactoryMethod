package tech.antoniosgarbi.pizza;


public interface PizzaContrato {

    default void prepare() {
        System.out.println("ação padrão de preparação se a implementação não sobrescrever");
    }

    default void bake() {
        System.out.println("ação padrão de assamento se a implementação não sobrescrever");
    }

    default void cut() {
        System.out.println("ação padrão de corte se a implementação não sobrescrever");
    }

    default void box(){
        System.out.println("ação padrão de encaixotamento se a implementação não sobrescrever");
    }

}
