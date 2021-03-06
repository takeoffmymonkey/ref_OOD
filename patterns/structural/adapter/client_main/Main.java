package patterns.structural.adapter.client_main;

import patterns.structural.adapter.target_known_interface.Duck;
import patterns.structural.adapter.target_known_interface.MallardDuck;
import patterns.structural.adapter.service_unknown_interface.WildTurkey;
import patterns.structural.adapter.adapter.TurkeyAdapter;

/* АДАПТЕР: преобразует интерфейс класса к другому интерфейсу, на который рассчитан клиент
 *
 * - позволяет объектам с несовместимыми интерфейсами работать вместе
 *
 * - работая с адаптером через интерфейс, клиент не привязывается к конкретному классу адаптера
 *      - благодаря этому, можно добавлять в программу новые виды адаптеров, независимо от
 *      клиентского кода*/


/* ПРИМЕНИМОСТЬ
 * - когда хотите использовать сторонний класс, но его интерфейс не соответствует остальному коду
 * приложения
 *
 * - когда нужно использовать несколько существующих подклассов, но в них не хватает какой-то общей
 * функциональности, причём расширить суперкласс вы не можете */


/* ПЛЮСЫ
 * - отделяет и скрывает от клиента подробности преобразования различных интерфейсов */


/* МИНУСЫ
 * - усложняет код программы из-за введения дополнительных классов */


/* СУТЬ РЕАЛИЗАЦИИ
 * - клиент: класс, который содержит существующую бизнес-логику программы
 *      - например, работает с методами "утки quack() и fly())"
 *
 * - (целевой) интерфейс клиента: описывает протокол, через который клиент может работать с другими классами
 *      - например, интерфейсные методы "утки (quack() и fly())"
 *      - т.е. то, к чему адаптируется
 *
 * - (адаптируемый неизвестный) сервис: какой-то полезный класс, обычно сторонний
 *      - например, "дикая индейка (с методами gobble() и fly()) "
 *      - клиент не может использовать этот класс напрямую, т.к. сервис имеет непонятный ему интерфейс
 *
 * - адаптер: класс, который может одновременно работать и с клиентом, и с сервисом
 *      - например, "адаптерИндейки (приводит методы Индейки к методам Утки)"
 *      - реализует клиентский интерфейс и содержит ссылку на объект сервиса
 *          - при этом ссылок может быть даже не одна
 *      - получает вызовы от клиента через методы клиентского интерфейса, а затем переводит их в
 *      вызовы методов обёрнутого объекта в правильном формате */


/* АДАПТЕР VS ФАСАД
 * - фасад задает новый упрощенный интерфейс, а адаптер повторно использует старый, адаптируясь к
 * нему */


/* КЛИЕНТ */
public class Main {

    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck();
        System.out.println("The duck says...");
        mallardDuck.quack();
        mallardDuck.fly();

        Duck turkeyAdapter = new TurkeyAdapter(new WildTurkey());
        System.out.println("The turkey says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}