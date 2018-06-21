package patterns.creational.factory_method.abstract_product;

/* АБСТРАКЦИЯ ПРОДУКТА
 * - определяет общий интерфейс объектов, которые может произвести создатель и его подклассы */

public interface Pizza {

    void prepare();

    void bake();

    void cut();

    void box();
}
