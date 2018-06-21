package patterns.behavioral.command_null_object.invoker;

import patterns.behavioral.command_null_object.abstract_command.Command;
import patterns.behavioral.command_null_object.concrete_command_macrocommand_null_object.NoCommand;


/* ИНИЦИАТОР: хранит ссылку на объект команды и обращается к нему, когда нужно выполнить какое-то
 * действие
 *
 * - работает с командами только через их общий интерфейс, вызывая их метод execute()
 *      - т.е. не знает, какую конкретно команду использует, так как получает готовый объект команды
 *      от клиента */

public class SimpleRemoteController {
    Command command;
    // здесь может быть стек команд

    public SimpleRemoteController() {
        command = new NoCommand(); // чтобы избежать проверки наличия команды перед выполнением
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

    public void pressUndoButton() {
        command.undo();
    }
}