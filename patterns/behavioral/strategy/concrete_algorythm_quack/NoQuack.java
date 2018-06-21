package patterns.behavioral.strategy.concrete_algorythm_quack;

import patterns.behavioral.strategy.abstract_algorythm_quack.QuackBehavior;

/* КОНКРЕТНАЯ РЕАЛИЗАЦИЯ ПОВЕДЕНИЯ "КРЯКАНЬЕ" - "НЕ УМЕНИЕ КРЯКАТЬ"
 * - соответственно реализует метод имплементируемого интерфейса */

public class NoQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("...");
    }
}
