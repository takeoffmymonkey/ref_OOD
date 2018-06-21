package patterns.creational.simple_factory.concrete_сlient;

import patterns.creational.simple_factory.abstract_product.Pizza;
import patterns.creational.simple_factory.concrete_factory.SimplePizzaFactory;

/* КЛИЕНТ ФАБРИКИ
 * - конкретная фабрика задается в конструкторе
 * - обращается к фабрике (к ее методу-создателю) за конкретным продуктом
 *      - получает его в виде абстракции продукта
 * - работает с ним дальше */

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) { // метод не должен знать детали создания объекта пиццы
        Pizza pizza;

        pizza = factory.createPizza(type); // обращение к фабрике

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
