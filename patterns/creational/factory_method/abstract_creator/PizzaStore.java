package patterns.creational.factory_method.abstract_creator;

import patterns.creational.factory_method.abstract_product.Pizza;

/* АБСТРАКТНЫЙ СОЗДАТЕЛЬ
 * - объявляет ФМ, который должен возвращать новые объекты продуктов
 *      - тип результата метода должен совпадать с общим интерфейсом продуктов
 *      - метод может объявляться абстрактным, чтобы все подклассы реализовали его по-своему
 *          - но также может иметь и дефолтную реализацию, возвращающую некий стандартный продукт
 *
 * - сам класс, как правило, не ограничивается ФМ, и имеет код, который работает с продуктом,
 * который возвращает ФМ */


public abstract class PizzaStore {

    // реализация используется всеми наследниками
    public final Pizza orderPizza(String type) { // можно даже объявить как final
        Pizza pizza;

        // слабая связь - неизвестно, какая будет использоваться реализация метода createPizza()
        pizza = createPizza(type); // вызов ФМ

        pizza.prepare(); // другой код работы с абстракцией продукта
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /* ФАБРИЧНЫЙ МЕТОД */
    abstract protected Pizza createPizza(String type); // наследник должен реализовать свою версию
}