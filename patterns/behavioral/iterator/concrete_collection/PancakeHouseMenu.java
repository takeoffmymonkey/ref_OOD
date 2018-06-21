package patterns.behavioral.iterator.concrete_collection;

import patterns.behavioral.iterator.collection_item.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;


/* КОНКРЕТНАЯ КОЛЛЕКЦИЯ: возвращает новый экземпляр определённого конкретного итератора, связав
 * его с текущим объектом коллекции
 *
 * - сигнатура метода возвращает интерфейс итератора, что позволяет клиенту не зависеть от
 * конкретных классов итераторов */


public class PancakeHouseMenu { // не имплементирует мое Folder, т.к. нужно вернуть Iterator другого типа
    ArrayList menuItems;

    public PancakeHouseMenu(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("PopCorn", 2.23);
        addItem("IceCream", 4.11);
        addItem("Tea", 1.22);
    }


    void addItem(String name, double price) {
        MenuItem menuItem = new MenuItem(name, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return menuItems.iterator(); // ArrayList имеет уже готовый Iterator
    }

}
