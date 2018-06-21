package patterns.creational.factory_method.concrete_creator;

import patterns.creational.factory_method.abstract_product.Pizza;
import patterns.creational.factory_method.abstract_creator.PizzaStore;
import patterns.creational.factory_method.concrete_product.NYCheesePizza;
import patterns.creational.factory_method.concrete_product.NyVeggiePizza;


/* КОНКРЕТНЫЕ СОЗДАТЕЛИ:
 * - по-своему реализуют ФМ, производя те или иные конкретные продукты, но возвращая их абстракции
 *
 * - ФМ не обязан только создавать новые объекты:
 *      - например, может возвращать существующие объекты из какого-то хранилища или кэша */


public class NYPizzaStore extends PizzaStore {
    /* РЕАЛИЗАЦИЯ ФМ */
    @Override
    public Pizza createPizza(String type) { // данная реализация возвращает свои версии продукта
        // можно было бы делать дополнительную проверку, существует ли продукт
        if (type.equals("cheese")) return new NYCheesePizza(); // создаются нью-йоркские версии пицц
        if (type.equals("veggie")) return new NyVeggiePizza(); // создаются нью-йоркские версии пицц
        else return null;
    }
}