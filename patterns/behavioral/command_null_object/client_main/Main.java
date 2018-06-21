package patterns.behavioral.command_null_object.client_main;

import patterns.behavioral.command_null_object.abstract_command.Command;
import patterns.behavioral.command_null_object.concrete_command_macrocommand_null_object.LightOffCommand;
import patterns.behavioral.command_null_object.concrete_command_macrocommand_null_object.LightOnCommand;
import patterns.behavioral.command_null_object.concrete_command_macrocommand_null_object.MacroCommand;
import patterns.behavioral.command_null_object.concrete_command_macrocommand_null_object.WarmWaterOnCommand;
import patterns.behavioral.command_null_object.concrete_command_macrocommand_null_object.WaterOffCommand;
import patterns.behavioral.command_null_object.concrete_command_macrocommand_null_object.WaterOnCommand;
import patterns.behavioral.command_null_object.invoker.SimpleRemoteController;
import patterns.behavioral.command_null_object.receiver.Light;
import patterns.behavioral.command_null_object.receiver.Water;

import java.util.ArrayList;
import java.util.List;

/* КОМАНДА: превращает запросы в объекты, позволяя передавать их как аргументы при вызове методов,
 * ставить запросы в очередь, логировать их, а также поддерживать отмену операций
 *
 * - отделяет объект, выдающий запросы, от объекта, который умеет их выполнять
 *
 * - для многократной отмены, вместо ссылки на последнюю выполненную команду нужно хранить стек
 * предыдущих команд, а метод undo() будет извлекать последнюю команду
 *
 * - объекты команд могут помещаться в очередь, затем программные потоки последовательно их
 * извлекают, вызывают их метод execute() и переходят к следующему объекту
 *
 * - команды можно регистрировать в логе на диске с помощью дополнительного метода store(), а
 * загружать в случае восстановления системы с помощью дополнительного метода load() */


/* NULL OBJECT:
 * - применяются, когда вернуть полноценный объект невозможно, но хочется избавить клиента от
 * необходимости проверять null-ссылки
 *
 * - некоторые считают самостоятельным паттерном */


/* ПРИМЕНЕНИЕ
 * - когда хотите параметризовать объекты выполняемым действием
 * - когда хотите ставить операции в очередь, выполнять их по расписанию или передавать по сети
 * - когда нужна операция отмены */


/* ПЛЮСЫ
 * - убирает прямую зависимость между объектами, вызывающими операции, и объектами, которые их
 * непосредственно выполняют
 *
 * - позволяет реализовать простую отмену и повтор операций
 *
 * - позволяет реализовать отложенный запуск операций
 *
 * - позволяет собирать сложные команды из простых
 *
 * - реализует принцип открытости/закрытости */


/* МИНУСЫ
 * - усложняет код программы из-за введения множества дополнительных классов */


/* СУТЬ РЕАЛИЗАЦИИ
 * - инициатор: хранит ссылку на объект команды и обращается к нему, когда нужно выполнить какое-то
 * действие
 *      - например, "пульт дистанционного управления"
 *      - работает с командами только через их общий интерфейс, вызывая их метод execute()
 *          - т.е. не знает, какую конкретно команду использует, так как получает готовый объект
 *          команды от клиента
 *
 * - абстракция команды: описывает общий для всех конкретных команд интерфейс
 *      - например, "команда"
 *      - имеет минимум один метод execute() для запуска команды
 *      - (опционально) методы undo(), store(), load() - для отмены изменений, сохранения команды в
 *      лог и загрузки при восстановлении соответственно
 *
 * - конкретные команды: реализуют различные запросы, следуя общему интерфейсу команд
 *      - например: "команда включения света", "команда выключения света", "(макро)команда включения
 *      света и воды", "пустая команда"
 *      - обычно команда не делает всю работу самостоятельно, а лишь передаёт вызов получателю,
 *      которым является один из объектов бизнес-логики.
 *      - содержит ссылку на получателя, чей конкретный метод она использует в своем execute()
 *
 * - получатель: содержит бизнес-логику программы
 *      - например, "свет", "вода"
 *      - в этой роли может выступать практически любой объект
 *      - обычно команды перенаправляют вызовы получателям
 *          - иногда, чтобы упростить программу, вы можете избавиться от получателей, «слив» их код
 *          в классы команд
 *
 * - клиент: создаёт объекты конкретных команд, передавая в них все необходимые параметры, среди
 * которых могут быть и ссылки на объекты получателей
 *      - после этого клиент связывает объекты отправителей с созданными командами */

/* КЛИЕНТ */
public class Main {

    public static void main(String[] args) {
        SimpleRemoteController simpleRemoteController = new SimpleRemoteController(); // инициатор
        Light light = new Light(); // получатель
        Water water = new Water(); // получатель

        LightOnCommand lightOnCommand = new LightOnCommand(light); // команды
        LightOffCommand lightoffCommand = new LightOffCommand(light);
        WaterOnCommand waterOnCommand = new WaterOnCommand(water);
        WaterOffCommand waterOffCommand = new WaterOffCommand(water);
        WarmWaterOnCommand warmWaterOnCommand = new WarmWaterOnCommand(water);
        MacroCommand macroCommand = new MacroCommand();

        List<Command> commands = new ArrayList<>();
        commands.add(lightOnCommand);
        commands.add(warmWaterOnCommand);
        macroCommand.setCommands(commands);


        simpleRemoteController.setCommand(lightOnCommand); // установка команды в инициатор
        simpleRemoteController.pressButton(); // запуск команды через инициатор

        simpleRemoteController.setCommand(lightoffCommand);
        simpleRemoteController.pressButton();

        simpleRemoteController.setCommand(waterOnCommand);
        simpleRemoteController.pressButton();

        simpleRemoteController.setCommand(waterOffCommand);
        simpleRemoteController.pressButton();

        simpleRemoteController.setCommand(warmWaterOnCommand);
        simpleRemoteController.pressButton();

        simpleRemoteController.pressUndoButton();

        simpleRemoteController.setCommand(macroCommand);
        simpleRemoteController.pressButton();
        simpleRemoteController.pressUndoButton();
    }
}