package patterns.structural.facade.complicated_system;


/* СЛОЖНАЯ ПОДСИСТЕМА: состоит из множества разнообразных классов
 * - чтобы заставить их что-то делать, нужно знать подробности устройства подсистемы, порядок
 * инициализации объектов и так далее
 *
 * - классы подсистемы не знают о существовании фасада и работают друг с другом напрямую */


public class Light {

    public void on() {
        System.out.println("Turning on the light");
    }


    public void off() {
        System.out.println("Turning off the light");
    }


    public void dim() {
        System.out.println("Dimming the light");
    }

}