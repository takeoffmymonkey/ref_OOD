package patterns.behavioral.iterator.concrete_iterator;

import patterns.behavioral.iterator.abstract_iterator.Iterator;
import patterns.behavioral.iterator.collection_item.MenuItem;


/* КОНКРЕТНЫЙ ИТЕРАТОР: реализует алгоритм обхода какой-то конкретной коллекции
 *
 * - объект итератора должен сам отслеживать текущую позицию при обходе коллекции, чтобы отдельные
 * итераторы могли обходить одну и ту же коллекцию независимо */


public class DinerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position = 0;


    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }


    @Override
    public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }


    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position += 1;
        return menuItem;
    }
}