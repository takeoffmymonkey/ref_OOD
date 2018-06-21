package patterns.behavioral.command_null_object.concrete_command_macrocommand_null_object;

import patterns.behavioral.command_null_object.abstract_command.Command;

import java.util.List;


/* КОНКРЕТНЫЕ КОМАНДЫ: реализуют различные запросы, следуя общему интерфейсу команд
 *
 * - обычно команда не делает всю работу самостоятельно, а лишь передаёт вызов получателю, которым
 * является один из объектов бизнес-логики.
 *
 * - содержит ссылку на получателя, чей конкретный метод она использует в своем execute() */


/* МАКРОКОМАНДА: содержит список команд и метод для его установки */

public class MacroCommand implements Command {

    List<Command> commands;


    public void setCommands(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}
