package patterns.behavioral.strategy.abstract_client;

import patterns.behavioral.strategy.abstract_algorythm_fly.FlyBehavior;
import patterns.behavioral.strategy.abstract_algorythm_quack.QuackBehavior;

/* АБСТРАКЦИЯ КЛИЕНТА
 * - имеет ссылки на абстакции поведения
 * - вызов метода выполнения реального поведение происходит при помощи соответствующих методов
 * - имеет методы для указания абстракции поведения во время работы */

public abstract class Duck {
    public QuackBehavior quackBehavior; // интерфейс поведения
    public FlyBehavior flyBehavior; // интерфейс поведения

    public void performQuack() {
        quackBehavior.quack(); // делегирование операции классам поведения
    }


    public void performFly() {
        flyBehavior.fly(); // делегирование операции классам поведения
    }


    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior; // динамическая смена поведения
    }


    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior; // динамическая смена поведения
    }
}