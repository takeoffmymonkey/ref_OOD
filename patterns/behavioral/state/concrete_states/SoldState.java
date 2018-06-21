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


public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    @Override
    public void insertQuater() {
        System.out.println("Подождите, мы уже выдаем жевачку");
    }

    @Override
    public void ejectQuater() {
        System.out.println("Извините, но вы уже повернули рычаг");
    }

    @Override
    public void turnCrank() {
        System.out.println("Если повернуть рычаг дважды, то вы все равно не получите 2 жевачки");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuaterState());
        } else {
            System.out.println("Извините, жевачки закончились");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}