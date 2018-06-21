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
 * - решения: синхронизированный блок в методе в месте создания экземпляра
 *      - синхронизирован только тот код, который производит создание экземпляра
 *      - переменная должна быть volatile
 *          - гарантирует, что параллельные потоки будут правильно работать с переменной при ее
 *          инициализации экземпляром
 *      - не работает ниже версии 1.5 */


public class ThreadSafeSingleton3 {
    /* Волатильная переменная */
    private static volatile ThreadSafeSingleton3 singleton;


    /* Приватный конструктор */
    private ThreadSafeSingleton3() {
    }


    /* Статический метод возвращающий экземпляр */
    public static ThreadSafeSingleton3 getInstance() {
        if (singleton == null) {
            /* Создание экземпляра в СИНХРОНИЗИРОВАННОМ БЛОКЕ*/
            synchronized (ThreadSafeSingleton3.class) {
                if (singleton == null) singleton = new ThreadSafeSingleton3();
            }
        }
        return singleton;
    }
}