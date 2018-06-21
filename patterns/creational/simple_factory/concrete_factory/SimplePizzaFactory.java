package patterns.creational.simple_factory.concrete_factory;

import patterns.creational.simple_factory.concrete_product.CheesePizza;
import patterns.creational.simple_factory.abstract_product.Pizza;
import patterns.creational.simple_factory.concrete_product.VeggiePizza;

/* КОНКРЕТНАЯ ФАБРИКА
 * - имеет единственный метод, который создает конкретные продукты, но возвращает их в виде
 * абстракций
 *      - имеет параметр для ключа, по которому создается конкретный продукт
 *      - метод может быть статическим, чтобы не нужно было создавать экземпляр фабрики, но тогда
 *      нельзя будет его наследовать и расширять в подклассах */


public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese"))
            pizza = new CheesePizza(); // от ключа создаются конкретные продукты
        if (type.equals("veggie")) pizza = new VeggiePizza();
        return pizza; // возвращает абстракцию продукта
    }
}
