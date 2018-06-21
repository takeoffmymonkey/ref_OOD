package patterns.creational.abstract_factory.concrete_factory;

import patterns.creational.abstract_factory.abstract_factory.PizzaIngredientFactory;
import patterns.creational.abstract_factory.abstract_product.Cheese;
import patterns.creational.abstract_factory.abstract_product.Sauce;
import patterns.creational.abstract_factory.abstract_product.Veggie;
import patterns.creational.abstract_factory.concrete_product.Ketchup;
import patterns.creational.abstract_factory.concrete_product.Mozarella;
import patterns.creational.abstract_factory.concrete_product.Pineapple;


/* КОНКРЕТНЫЕ ФАБРИКИ:
 * - относятся каждая к своей вариации продуктов и реализуют методы абстрактной фабрики, позволяя
 * создавать все продукты определённой вариации
 *
 * - методы возвращают свои версии продуктов, которая должна производить данная конфигурация фабрики*/


public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Sauce createSauce() {
        return new Ketchup();
    }

    @Override
    public Cheese createCheese() {
        return new Mozarella();
    }

    @Override
    public Veggie createVeggie() {
        return new Pineapple();
    }
}
