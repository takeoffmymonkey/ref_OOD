package patterns.structural.adapter.adapter;

import patterns.structural.adapter.target_known_interface.Duck;
import patterns.structural.adapter.service_unknown_interface.WildTurkey;


/* АДАПТЕР: класс, который может одновременно работать и с клиентом, и с сервисом
 * - реализует клиентский интерфейс и содержит ссылку на объект сервиса
 *      - при этом ссылок может быть даже не одна
 *
 * - получает вызовы от клиента через методы клиентского интерфейса, а затем переводит их в вызовы
 * методов обёрнутого объекта в правильном формате*/


public class TurkeyAdapter implements Duck {

    WildTurkey wildTurkey;

    public TurkeyAdapter(WildTurkey wildTurkey) {
        this.wildTurkey = wildTurkey;
    }

    @Override
    public void quack() {
        wildTurkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            wildTurkey.fly();
        }
    }
}
