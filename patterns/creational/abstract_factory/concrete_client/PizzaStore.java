package patterns.creational.abstract_factory.concrete_client;

import patterns.creational.abstract_factory.abstract_factory.PizzaIngredientFactory;
import patterns.creational.abstract_factory.abstract_product.Cheese;
import patterns.creational.abstract_factory.abstract_product.Sauce;
import patterns.creational.abstract_factory.abstract_product.Veggie;


/* КЛИЕНТ: обращается к абстрактной фабрике, чтобы получить продукты
 * - получает в конструктор ссылку на конкретную фабрику, с которой будет работать
 * - работает с ее методами для получения конфигурации продуктов  */

public class PizzaStore {
    PizzaIngredientFactory ingredientFactory;

    public PizzaStore(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void createPizza() {
        Sauce s = ingredientFactory.createSauce();
        Cheese c = ingredientFactory.createCheese();
        Veggie v = ingredientFactory.createVeggie();
        System.out.println("В данном семействе ингридиентов: ");
        System.out.println("Использую такой соус: " + s.getName());
        System.out.println("Использую такой сыр: " + c.getName());
        System.out.println("Использую такой овощь: " + v.getName());
    }
}
