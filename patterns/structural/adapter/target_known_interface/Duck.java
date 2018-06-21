package patterns.structural.adapter.target_known_interface;


/* ПОНЯТНЫЙ КЛИЕНТУ ИНТЕРФЕЙС: описывает протокол, через который клиент может работать с другими
 * классами
 *
 * - т.е. то, к чему адаптируется */


public interface Duck {
    void quack();

    void fly();
}