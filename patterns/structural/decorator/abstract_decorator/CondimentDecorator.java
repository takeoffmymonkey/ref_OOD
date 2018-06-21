package patterns.structural.decorator.abstract_decorator;

import patterns.structural.decorator.abstract_component.Beverage;

/* АБСТРАКЦИЯ ДЕКОРАТОРА
 * - должна наследоваться от абстракции компонента */


public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription(); // метод необходимо переопределять, чтобы декоратор
    // мог добавить к значению Beverage, к которому он добавлен, также и свое значение
    // а метод cost() и так должен быть переопределен
}