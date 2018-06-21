package patterns.behavioral.iterator.concrete_collection;

import patterns.behavioral.iterator.collection_item.MenuItem;
import patterns.behavioral.iterator.abstract_collection.Menu;
import patterns.behavioral.iterator.abstract_iterator.Iterator;
import patterns.behavioral.iterator.concrete_iterator.DinerMenuIterator;


/* КОНКРЕТНАЯ КОЛЛЕКЦИЯ: возвращает новый экземпляр определённого конкретного итератора, связав
 * его с текущим объектом коллекции
 *
 * - сигнатура метода возвращает интерфейс итератора, что позволяет клиенту не зависеть от
 * конкретных классов итераторов */


public class DinerMenu implements Menu {
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[3];

        setItem("Borsch", 2.20, 0);
        setItem("Soup", 2.11, 1);
        setItem("Bread", .20, 2);
    }

    void setItem(String name, double price, int index) {
        MenuItem menuItem = new MenuItem(name, price);
        menuItems[index] = menuItem;
    }


    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
