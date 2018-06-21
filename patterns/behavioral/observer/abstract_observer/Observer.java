package patterns.behavioral.observer.abstract_observer;

import patterns.behavioral.observer.abstract_observable.Observable;

/* АБСТРАКЦИЯ НАБЛЮДАТЕЛЯ, КОТОРЫЙ ПОДПИСЫВАЕТСЯ НА СУБЪЕКТ
 * - имеет 1 метод, который вызывается наблюдателем в качестве оповещения
 *      - также передается сам наблюдатель, чтобы знать от кого оповещение, если наблюдается за
 *      несколькими субъектами
 *          - иногда можно передавать еще и сами данные (как Object), но это не желательно */


public interface Observer {
    void update(Observable observable);
}
