package patterns.creational.abstract_factory.concrete_product;

import patterns.creational.abstract_factory.abstract_product.Sauce;


/* КОНКРЕТНЫЕ ПРОДУКТЫ:
 * большой набор классов, которые относятся к различным абстрактным продуктам, но имеют одни и те же
 * вариации */


public class Ketchup implements Sauce {
    @Override
    public String getName() {
        return "Ketchup";
    }
}
