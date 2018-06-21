package patterns.creational.abstract_factory.abstract_factory;

import patterns.creational.abstract_factory.abstract_product.Cheese;
import patterns.creational.abstract_factory.abstract_product.Sauce;
import patterns.creational.abstract_factory.abstract_product.Veggie;


/* АБСТРАКТНАЯ ФАБРИКА:
 * - объявляет методы создания различных абстрактных продуктов
 * - содержит набор методов-создателей
 *          - каждый возвращает свою абстракцию продукта */


public interface PizzaIngredientFactory {
    Sauce createSauce();

    Cheese createCheese();

    Veggie createVeggie();
}
