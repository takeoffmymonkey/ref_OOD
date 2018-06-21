package patterns.structural.decorator.concrete_decorator;

import patterns.structural.decorator.abstract_component.Beverage;
import patterns.structural.decorator.abstract_decorator.CondimentDecorator;

/* РЕАЛИЗАЦИЯ АБСТРАКЦИИ ДЕКОРАТОРА
 * - также имеет ссылку на объект Beverage, к которому добавлен данный декоратор
 * - вместе со своими методами, также вызывает аналогичные методы объекта Beverage */


public class Mocha extends CondimentDecorator {
    Beverage beverage; // ссылка на любой ДРУГОЙ Beverage, к которому добавлен этот декоратор


    public Mocha(Beverage beverage) { // класс не может существовать без другого Beverage
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha"; // свое имя + имя Beverage, к которому добавлен этот декоратор
    }

    @Override
    public double cost() {
        return .20 + beverage.cost(); // своя цена + цена Beverage, к которому добавлен этот декоратор
    }
}
