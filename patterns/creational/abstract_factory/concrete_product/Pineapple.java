package patterns.creational.abstract_factory.concrete_product;

import patterns.creational.abstract_factory.abstract_product.Veggie;


/* КОНКРЕТНЫЕ ПРОДУКТЫ:
 * большой набор классов, которые относятся к различным абстрактным продуктам, но имеют одни и те же
 * вариации */


public class Pineapple implements Veggie {
    @Override
    public String getName() {
        return "Pineapple";
    }
}
