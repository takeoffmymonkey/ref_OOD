package patterns.structural.adapter.target_known_interface;


/* ПРОСТО РЕАЛИЗАЦИЯ ПОНЯТНОГО ИНТЕРФЕЙСА (для сравнения) */


public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
