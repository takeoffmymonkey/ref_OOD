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
 * - решение: статическая инициализация переменной
 *      - лишает возможности отложенной инициализации
 *      - но и нет необходимости делать в методе проверку на существование экземпляра */


public class ThreadSafeSingleton1 {
    /* Статическая инициализация переменной */
    private static ThreadSafeSingleton1 singleton = new ThreadSafeSingleton1();


    /* Приватный конструктор */
    private ThreadSafeSingleton1() {
    }


    /* Статический метод возвращающий экземпляр */
    public static ThreadSafeSingleton1 getInstance() {
        // не нужно делать проверку на существование экземпляра
        return singleton;
    }
}