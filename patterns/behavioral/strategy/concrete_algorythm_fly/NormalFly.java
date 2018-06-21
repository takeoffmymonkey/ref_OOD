package patterns.behavioral.strategy.concrete_algorythm_fly;

import patterns.behavioral.strategy.abstract_algorythm_fly.FlyBehavior;

/* КОНКРЕТНАЯ РЕАЛИЗАЦИЯ ПОВЕДЕНИЯ "ПОЛЕТ" - "НОРМАЛЬНЫЙ ПОЛЕТ"
 * - соответственно реализует метод имплементируемого интерфейса */

public class NormalFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly with wings");
    }
}