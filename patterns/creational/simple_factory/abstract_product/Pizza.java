package patterns.creational.simple_factory.abstract_product;

/* АБСТРАКЦИЯ ПРОДУКТА, который будет возвращаться фабрикой
 * - (опционально) имеет свои какие-то методы */

public interface Pizza {

    void prepare();

    void bake();

    void cut();

    void box();
}
