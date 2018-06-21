package patterns.creational.abstract_factory;

import patterns.creational.abstract_factory.concrete_client.PizzaStore;
import patterns.creational.abstract_factory.concrete_factory.NYPizzaIngredientFactory;

/* Все фабричные паттерны:
 *      - инкапсулируют создание экземпляров
 *      - обеспечивают слабую связанность за счет сокращения зависимости приложения от конкретных
 *      классов */


/* АБСТРАКТНАЯ ФАБРИКА: предоставляет интерфейс создания семейств взаимосвязанных продуктов, не
 * привязываясь к конкретным классам создаваемых продуктов
 *      - содержит несколько методов-создателей, каждый из которых создает определенный продукт для
 *      данного семейства
 *          - по сути это набор абстрактных Фабричных методов
 *          - какое конкретно семейство продуктов будет создаваться методами - определяется
 *          реализацией абстрактной фабрики
 *              - т.о. образом создаются фабрики, производящие продукты для разных контекстов:
 *              разных регионов, разных операционных систем и т.д.
 *              - отделение кода позволяет динамически переключать фабрики для изменения поведения
 *          - у каждого из продуктов свой интерфейс, и каждый метод возвращает продукт как абстракцию
 *
 * - основана на композиции:
 *       - создание продуктов реализуется в методах фабрики, доступ к которым осуществляется через
 *       ее интерфейс */


/* ПРИМЕНИМОСТЬ
 * - когда бизнес-логика программы должна работать с разными видами связанных друг с другом
 * продуктов, не завися от конкретных классов продуктов
 * - когда в программе уже используется Фабричный метод, но очередные изменения предполагают
 * введение новых типов продуктов */


/* ПЛЮСЫ
 * - гарантирует сочетаемость создаваемых продуктов
 * - избавляет клиентский код от привязки к конкретным классам продуктов
 * - выделяет код производства продуктов в одно место, упрощая поддержку кода
 * - упрощает добавление новых продуктов в программу
 * - реализует принцип открытости/закрытости */


/* МИНУСЫ
 * - усложняет код программы из-за введения множества дополнительных классов
 * - требует наличия всех типов продуктов в каждой вариации */


/* СУТЬ РЕАЛИЗАЦИИ
 * - абстрактные продукты: объявляют интерфейсы продуктов, которые связаны друг с другом по смыслу,
 * но выполняют разные функции
 *      - например, "соус", "овощь", "сыр"
 *
 * - конкретные продукты: большой набор классов, которые относятся к различным абстрактным продуктам,
 * но имеют одни и те же вариации
 *      - например, "соус майонез", "соус кетчуп", "овощь ананас", "сыр диетический", "сыр моцарелла"
 *
 * - абстрактная фабрика: объявляет методы создания различных абстрактных продуктов
 *      - например, "фабрика ингридиентов пиццы"
 *      - содержит набор методов-создателей
 *          - каждый возвращает свою абстракцию продукта
 *
 * - конкретные фабрики: относятся каждая к своей вариации продуктов и реализуют методы абстрактной
 * фабрики, позволяя создавать все продукты определённой вариации
 *      - например, "нью-йоркская фабрика ингридиентов пиццы"
 *      - методы возвращают свои версии продуктов, которая должна производить данная конфигурация
 *      фабрики
 *
 * - конкретный клиент: обращается к абстрактной фабрике, чтобы получить продукты
 *      - например, "пиццерия"
 *      - получает в конструктор ссылку на конкретную фабрику, с которой будет работать
 *      - работает с ее методами для получения конфигурации продуктов*/


/* АФ VS АБСТРАКТНЫЙ МЕТОД
 * - АФ используется при создании семейств продуктов, когда нужно обеспечить логическую
 * согласованность создаваемых объектов, а ФБ для отделения клиентского кода от создания экземпляров
 * конкретных классов и в тех ситуациях, когда точный состав всех конкретных классов неизвестен
 * заранее
 *
 * - методы АФ часто реализуются как фабричные методы. Задача АФ - определить интерфейс для
 * создания набора продуктов. Каждый метод этого интерфейса отвечает за создание конкретного
 * продукта, и мы реализуем субкласс АФ, который предоставляет эти реализации. Т.о. фабричные
 * методы являются естественным способом реализации методов продуктов в абстрактных фабриках */


public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new NYPizzaIngredientFactory());
        pizzaStore.createPizza();
    }
}