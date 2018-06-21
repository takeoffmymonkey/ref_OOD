package patterns.behavioral.iterator.abstract_collection;

import patterns.behavioral.iterator.abstract_iterator.Iterator;


/* АБСТРАКТНАЯ КОЛЛЕКЦИЯ: описывает интерфейс получения итератора из коллекции
 *
 * - коллекции не всегда являются списком: это может быть и база данных, и удалённое API, и даже
 * дерево Компоновщика
 *      - поэтому сама коллекция может создавать итераторы, так как она знает, какие именно
 *      итераторы способны с ней работать */


public interface Menu {
    Iterator createIterator();
}
