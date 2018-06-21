package patterns.structural.adapter.service_unknown_interface;


/*(АДАПТИРУЕМЫЙ) СЕРВИС: какой-то полезный класс, обычно сторонний
 *
 * - клиент не может использовать этот класс напрямую, т.к. сервис имеет непонятный ему интерфейс */


public class WildTurkey {
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I am flying a short distance");
    }
}
