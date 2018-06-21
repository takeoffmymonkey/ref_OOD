package patterns.creational.singleton.singleton;


/* КОНКРЕТНЫЙ СИНГЛТОН - определяет статический метод getInstance(), который возвращает единственный
 * экземпляр своего класса
 *
 * - конструктор должен быть скрыт от клиентов
 *      - вызов метода getInstance() должен стать единственным способом получить объект этого
 *      класса
 *
 * - переменная экземпляра
 *
 * - (опционально) другой код класса */


/* ПРОБЛЕМЫ МНОГОПОТОЧНОСТИ
 * - если 2 потока обратятся к методу getInstance(), то есть вероятность, что для обоих еще не будет
 * существовать экземпляра, поэтому будет создано 2 экземпляра
 *
 * - решение: синхронизированный метод
 *          - весь метод становится synchronized
 *          - работа метода замедляется в 100 раз
 *              - не подходит для частого использования */


public class ThreadSafeSingleton2 {
    private static ThreadSafeSingleton2 singleton;


    /* Приватный конструктор */
    private ThreadSafeSingleton2() {
    }


    /* Статический СИНХРОНИЗИРОВАННЫЙ метод возвращающий экземпляр */
    public static synchronized ThreadSafeSingleton2 getInstance() {
        if (singleton == null) singleton = new ThreadSafeSingleton2();
        return singleton;
    }
}