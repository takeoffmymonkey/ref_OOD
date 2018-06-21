package patterns.structural.facade.complicated_system;


/* СЛОЖНАЯ ПОДСИСТЕМА: состоит из множества разнообразных классов
 * - чтобы заставить их что-то делать, нужно знать подробности устройства подсистемы, порядок
 * инициализации объектов и так далее
 *
 * - классы подсистемы не знают о существовании фасада и работают друг с другом напрямую */


public class Reaper {
    public void start() {
        System.out.println("Starting Reaper");
    }

    public void loadLastProject() {
        System.out.println("Loading last project");
    }

    public void close() {
        System.out.println("Closing Reaper");
    }
}