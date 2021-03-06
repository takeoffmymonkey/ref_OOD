package patterns.behavioral.command_null_object.concrete_command_macrocommand_null_object;

import patterns.behavioral.command_null_object.abstract_command.Command;
import patterns.behavioral.command_null_object.receiver.Water;


/* КОНКРЕТНЫЕ КОМАНДЫ: реализуют различные запросы, следуя общему интерфейсу команд
 *
 * - обычно команда не делает всю работу самостоятельно, а лишь передаёт вызов получателю, которым
 * является один из объектов бизнес-логики.
 *
 * - содержит ссылку на получателя, чей конкретный метод она использует в своем execute() */


public class WaterOffCommand implements Command {
    private Water water; // получатель


    public WaterOffCommand(Water water) {
        this.water = water;
    }

    @Override
    public void execute() {
        water.stopWater();
    }


    @Override
    public void undo() {
        water.runWater();
    }
}
