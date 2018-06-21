package patterns.behavioral.strategy.concrete_client;

import patterns.behavioral.strategy.abstract_client.Duck;
import patterns.behavioral.strategy.concrete_algorythm_fly.NormalFly;
import patterns.behavioral.strategy.concrete_algorythm_quack.NormalQuack;

/* КОНКРЕТНЫЙ КЛИЕНТ
 * - задает свои конкретные поведения при создании */

public class MallardDuck extends Duck {
    public MallardDuck() { // поведение может быть предустановленным
        this.flyBehavior = new NormalFly();
        this.quackBehavior = new NormalQuack();
    }
}
