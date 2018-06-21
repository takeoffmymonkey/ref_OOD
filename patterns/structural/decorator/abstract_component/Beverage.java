package patterns.structural.decorator.abstract_component;

/* АБСТРАКЦИЯ КОМПОНЕНТА
 * - все наследуется от него
 * - может быть как абстрактным классом, так и интерфейсом */

public abstract class Beverage {

    public String description;

    public String getDescription() {
        return description;
    }

    abstract public double cost(); // каждая реализация должна указать свою цену
}
