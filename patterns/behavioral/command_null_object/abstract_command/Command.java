package patterns.behavioral.command_null_object.abstract_command;

/* АБСТРАКЦИЯ КОМАНДЫ: описывает общий для всех конкретных команд интерфейс
 *
 * - имеет минимум один метод execute() для запуска команды
 *
 * - (опционально) методы undo(), store(), load() - для отмены изменений, сохранения команды в
 * лог и загрузки при восстановлении соответственно */


public interface Command {
    void execute();

    void undo(); // опционально

//    void store(); // опционально

//    void load(); // опционально
}
