package patterns.behavioral.state.context;

import patterns.behavioral.state.abstract_state.State;
import patterns.behavioral.state.concrete_states.HasQuaterState;
import patterns.behavioral.state.concrete_states.NoQuaterState;
import patterns.behavioral.state.concrete_states.SoldOutState;
import patterns.behavioral.state.concrete_states.SoldState;


/* КОНТЕКСТ: хранит ссылку на объект состояния и делегирует ему часть работы, зависящей от состояний
 * - работает с этим объектом через общий интерфейс состояний
 *
 * - должен иметь метод для присваивания ему нового объекта-состояния
 *
 * - если переходы между состояниями "статичны", то их стоит размещать в контексте, если
 * "динамичны" (например, зависят от количества шариков), то их лучше размещать в самом классе
 * состояния, но тогда возникают зависимости между классами состояний
 *
 * - и контекст и объекты конкретных состояний могут решать, когда и какое следующее состояние
 * будет выбрано
 *      - чтобы переключить состояние, нужно подать другой объект-состояние в контекст */


public class GumballMachine {
    State soldOutState;
    State noQuaterState;
    State hasQuaterState;
    State soldState;

    State state = soldOutState;
    int count = 0;


    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuaterState = new NoQuaterState(this);
        hasQuaterState = new HasQuaterState(this);
        soldState = new SoldState(this);
        count = numberGumballs;

        if (numberGumballs > 0) {
            state = noQuaterState;
        }
    }

    public void insertQuater() { // делегирование текущему состоянию
        state.insertQuater();
    }

    public void ejectQuater() { // делегирование текущему состоянию
        state.ejectQuater();
    }

    public void turnCrank() { // делегирование текущему состоянию
        state.turnCrank();
    }


    public void setState(State state) { // позволяет другим State менять состояние объекта
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("Шарик жевачки выкатывается из слота");
        if (count != 0) {
            count -= count;
        }
    }


    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuaterState() {
        return noQuaterState;
    }

    public State getHasQuaterState() {
        return hasQuaterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getCount() {
        return count;
    }
}
