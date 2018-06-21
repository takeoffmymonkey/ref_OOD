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


public class HasQuaterState implements State {
    GumballMachine gumballMachine;


    public HasQuaterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("Вы не можете закинуть еще одну монету");
    }

    @Override
    public void ejectQuater() {
        System.out.println("Возвращаю монету");
        gumballMachine.setState(gumballMachine.getNoQuaterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Вы повернули рычаг");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("Нельзя выдать жевачку");
    }
}