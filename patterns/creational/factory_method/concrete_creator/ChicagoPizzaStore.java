package patterns.creational.factory_method.concrete_creator;

import patterns.creational.factory_method.abstract_product.Pizza;
import patterns.creational.factory_method.abstract_creator.PizzaStore;
import patterns.creational.factory_method.concrete_product.ChicagoCheesePizza;
import patterns.creational.factory_method.concrete_product.ChicagoVeggiePizza;

/* КОНКРЕТНЫЕ СОЗДАТЕЛИ:
 * - по-своему реализуют ФМ, производя те или иные конкретные продукты, но возвращая их абстракции
 *
 * - ФМ не обязан только создавать новые объекты:
 *      - например, может возвращать существующие объекты из какого-то хранилища или кэша */


public class ChicagoPizzaStore extends PizzaStore {
    /* РЕАЛИЗАЦИЯ ФМ */
    @Override
    public Pizza createPizza(String type) { // данная реализация возвращает свои версии продукта
        // можно было бы делать дополнительную проверку, существует ли продукт
        if (type.equals("cheese")) return new ChicagoCheesePizza(); // создаются чикагские версии пицц
        if (type.equals("veggie")) return new ChicagoVeggiePizza(); // создаются чикагские версии пицц
        else return null;
    }
}