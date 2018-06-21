package patterns.behavioral.command_null_object.receiver;


/* ПОЛУЧАТЕЛЬ: содержит бизнес-логику программы
 *
 * - в этой роли может выступать практически любой объект
 *
 * - обычно команды перенаправляют вызовы получателям
 *      - иногда, чтобы упростить программу, вы можете избавиться от получателей, «слив» их код в
 *      классы команд */

public class Light {

    public void on() {
        System.out.println("Light is on");
    }

    public void off() {
        System.out.println("Light is off");
    }
}