package patterns.structural.decorator.concrete_component;

import patterns.structural.decorator.abstract_component.Beverage;

/* РЕАЛИЗАЦИИ АБСТРАКЦИИ КОМПОНЕНТА */

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend"; // свое название
    }

    public double cost() {
        return 0.99; // своя цена
    }
}
