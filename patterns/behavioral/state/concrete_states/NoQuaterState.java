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


public class NoQuaterState implements State {
    GumballMachine gumballMachine;


    public NoQuaterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    @Override
    public void insertQuater() {
        System.out.println("Вы бросили монетку");
        gumballMachine.setState(gumballMachine.getHasQuaterState());
    }


    @Override
    public void ejectQuater() {
        System.out.println("Вы еще не бросили монетку");
    }


    @Override
    public void turnCrank() {
        System.out.println("Вы дернули ручку, но монетка еще не брошена");
    }


    @Override
    public void dispense() {
        System.out.println("Сначала нужно бросить монетку");
    }
}
