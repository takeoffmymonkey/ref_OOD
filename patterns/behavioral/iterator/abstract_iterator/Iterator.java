package patterns.behavioral.iterator.abstract_iterator;


/* АБСТРАКТНЫЙ ИТЕРАТОР: описывает интерфейс для доступа и обхода элементов коллекции */


public interface Iterator {
    boolean hasNext();

    Object next();
}