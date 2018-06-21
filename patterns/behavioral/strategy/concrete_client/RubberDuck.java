package patterns.behavioral.strategy.concrete_client;

import patterns.behavioral.strategy.abstract_client.Duck;
import patterns.behavioral.strategy.concrete_algorythm_fly.NoFly;
import patterns.behavioral.strategy.concrete_algorythm_quack.NoQuack;

/* КОНКРЕТНЫЙ КЛИЕНТ
 * - задает свои конкретные поведения при создании */

public class RubberDuck extends Duck {

    public RubberDuck() { // поведение может быть предустановленным
        this.flyBehavior = new NoFly();
        this.quackBehavior = new NoQuack();
    }
}