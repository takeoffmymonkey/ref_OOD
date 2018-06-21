package patterns.creational.factory_method.concrete_product;

import patterns.creational.factory_method.abstract_product.Pizza;


/* КОНКРЕТНЫЕ ПРОДУКТЫ
 * - содержат код различных продуктов
 * - будут отличаться реализацией, но интерфейс у них будет общий */


public class NYCheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing NYCheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking NYCheesePizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting NYCheesePizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing NYCheesePizza");
    }
}
