package patterns.structural.decorator.concrete_component;

import patterns.structural.decorator.abstract_component.Beverage;

/* РЕАЛИЗАЦИИ АБСТРАКЦИИ КОМПОНЕНТА */

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso"; // свое название
    }

    public double cost() {
        return 1.99; // своя цена
    }
}
