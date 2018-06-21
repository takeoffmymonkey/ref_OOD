package patterns.behavioral.strategy.concrete_algorythm_quack;

import patterns.behavioral.strategy.abstract_algorythm_quack.QuackBehavior;

/* КОНКРЕТНАЯ РЕАЛИЗАЦИЯ ПОВЕДЕНИЯ "КРЯКАНЬЕ" - "НОРМАЛЬНОЕ КРЯКАНЬЕ"
 * - соответственно реализует метод имплементируемого интерфейса */

public class NormalQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}