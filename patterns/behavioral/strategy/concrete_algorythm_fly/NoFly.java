package patterns.behavioral.strategy.concrete_algorythm_fly;

import patterns.behavioral.strategy.abstract_algorythm_fly.FlyBehavior;

/* КОНКРЕТНАЯ РЕАЛИЗАЦИЯ ПОВЕДЕНИЯ "ПОЛЕТ" - "НЕ УМЕНИЕ ЛЕТАТЬ"
 * - соответственно реализует метод имплементируемого интерфейса */

public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly at all");
    }
}