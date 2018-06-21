package patterns.behavioral.command_null_object.concrete_command_macrocommand_null_object;

import patterns.behavioral.command_null_object.abstract_command.Command;
import patterns.behavioral.command_null_object.receiver.Light;


/* КОНКРЕТНЫЕ КОМАНДЫ: реализуют различные запросы, следуя общему интерфейсу команд
 *
 * - обычно команда не делает всю работу самостоятельно, а лишь передаёт вызов получателю, которым
 * является один из объектов бизнес-логики.
 *
 * - содержит ссылку на получателя, чей конкретный метод она использует в своем execute() */


public class LightOffCommand implements Command {
    private Light light; // получатель


    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }


    @Override
    public void undo() {
        light.on();
    }
}
