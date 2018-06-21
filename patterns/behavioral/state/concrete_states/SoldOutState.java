package patterns.behavioral.state.concrete_states;

import patterns.behavioral.state.context.GumballMachine;
import patterns.behavioral.state.abstract_state.State;


/* КОНКРЕТНЫЕ СОСТОЯНИЯ: реализуют поведения, связанные с определённым состоянием контекста
 * - иногда приходится создавать целые иерархии классов состояний, чтобы обобщить дублирующий код
 *
 * - состояние может иметь обратную ссылку на объект контекста
 *      - через неё не только удобно получать из контекста нужную информацию, но и осуществлять
 *      смену его состояния
 *
 * - и контекст и объекты конкретных состояний могут решать, когда и какое следующее состояние
 * будет выбрано
 *      - чтобы переключить состояние, нужно подать другой объект-состояние в контекст */


public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    @Override
    public void insertQuater() {
        System.out.println("Извините, но вы не можете вставить монетку - закончились жевачки");
    }

    @Override
    public void ejectQuater() {
        System.out.println("Нечего возвращать");
    }

    @Override
    public void turnCrank() {
        System.out.println("Вы повернули рычаг, но жевачек нет");
    }

    @Override
    public void dispense() {
        System.out.println("Нет жевачек для выдачи");
    }


    @Override
    public String toString() {
        return "Все жевачки проданы";
    }
}