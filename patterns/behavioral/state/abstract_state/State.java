package patterns.behavioral.state.abstract_state;


/* СОСТОЯНИЕ: описывает общий интерфейс для всех конкретных состояний
 *      - могут использоваться сразу несколькими контекстами */


public interface State {
    void insertQuater();

    void ejectQuater();

    void turnCrank();

    void dispense();
}