package patterns.behavioral.observer.abstract_observable;

import patterns.behavioral.observer.abstract_observer.Observer;

/* АБСТРАКЦИЯ СУБЪЕКТА, ЗА КОТОРЫМ НАБЛЮДАЮТ
 * - имеет методы:
 *      - для регистрации новых наблюдателей
 *      - для удаления указанного наблюдателя
 *      - для оповещения всех наблюдателей */

public interface Observable {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}