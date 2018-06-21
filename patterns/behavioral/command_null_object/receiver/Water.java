package patterns.behavioral.command_null_object.receiver;


/* ПОЛУЧАТЕЛЬ: содержит бизнес-логику программы
 *
 * - в этой роли может выступать практически любой объект
 *
 * - обычно команды перенаправляют вызовы получателям
 *      - иногда, чтобы упростить программу, вы можете избавиться от получателей, «слив» их код в
 *      классы команд */


public class Water {
    public enum Temperature {COLD, WARM}

    private Temperature temperature;

    public Water() {
        temperature = Temperature.COLD;
    }

    public void runWater() {
        System.out.println("Water is on");
    }

    public void stopWater() {
        System.out.println("Water is off");
    }

    public void setWarm() {
        temperature = Temperature.WARM;
        System.out.println("Warm water");
    }

    public void setCold() {
        temperature = Temperature.COLD;
        System.out.println("Cold water");
    }

    public Temperature getTemperature() {
        return temperature;
    }
}