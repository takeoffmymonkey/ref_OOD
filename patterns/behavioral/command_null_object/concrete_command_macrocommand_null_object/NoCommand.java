package patterns.behavioral.command_null_object.concrete_command_macrocommand_null_object;

import patterns.behavioral.command_null_object.abstract_command.Command;


/* КОНКРЕТНЫЕ КОМАНДЫ: реализуют различные запросы, следуя общему интерфейсу команд
 *
 * - обычно команда не делает всю работу самостоятельно, а лишь передаёт вызов получателю, которым
 * является один из объектов бизнес-логики.
 *
 * - содержит ссылку на получателя, чей конкретный метод она использует в своем execute() */


/* NULL OBJECT:
 * - применяются, когда вернуть полноценный объект невозможно, но хочется избавить клиента от
 * необходимости проверять null-ссылки
 *
 * - некоторые считают самостоятельным паттерном */


public class NoCommand implements Command {
    @Override
    public void execute() {
        // пустые методы
    }

    @Override
    public void undo() {

    }
}
