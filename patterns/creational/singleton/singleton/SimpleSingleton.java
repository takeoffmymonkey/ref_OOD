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
 * существовать экземпляра, поэтому будет создано 2 экземпляра */


public class SimpleSingleton {
    private static SimpleSingleton singleton;


    /* Приватный конструктор */
    private SimpleSingleton() {
    }


    /* Статический метод возвращающий экземпляр */
    public static SimpleSingleton getInstance() {
        if (singleton == null) singleton = new SimpleSingleton();
        return singleton;
    }
}