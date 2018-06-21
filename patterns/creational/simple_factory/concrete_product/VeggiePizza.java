package patterns.creational.simple_factory.concrete_product;

import patterns.creational.simple_factory.abstract_product.Pizza;

/* КОНКРЕТНЫЙ ПРОДУКТ
 * - то, что будет просить клиент и что будет создавать фабрика, но возвращаться все равно будет в
 * виде абстракции продукта */

public class VeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing VeggiePizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking VeggiePizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting VeggiePizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing VeggiePizza");
    }
}
