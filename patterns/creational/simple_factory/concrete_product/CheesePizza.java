package patterns.creational.simple_factory.concrete_product;

import patterns.creational.simple_factory.abstract_product.Pizza;

/* КОНКРЕТНЫЙ ПРОДУКТ
 * - то, что будет просить клиент и что будет создавать фабрика, но возвращаться все равно будет в
 * виде абстракции продукта */

public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing CheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking CheesePizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting CheesePizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing CheesePizza");
    }
}