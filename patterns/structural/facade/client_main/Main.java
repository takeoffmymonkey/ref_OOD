package patterns.structural.facade.client_main;


/* ФАСАД: предоставляет простой интерфейс к сложной системе классов, библиотеке или фреймворку
 *
 * - также обеспечивает логическую изоляцию клиента от подсистемы, состоящей из многих компонентов
 *      - т.е. принцип общения только с друзьями
 *
 * - основан на композиции и делегировании */


/* ПРИМЕНИМОСТЬ
 * - когда нужно представить простой или урезанный интерфейс к сложной подсистеме
 *
 * - когда хотите разложить подсистему на отдельные слои */


/* ПЛЮСЫ
 * - изолирует клиентов от компонентов сложной подсистемы */


/* МИНУСЫ
 * - рискует стать божественным объектом, привязанным ко всем классам программы */


/* СУТЬ РЕАЛИЗАЦИИ
 * - фасад: предоставляет быстрый доступ к определённой функциональности подсистемы
 *      - например, "кнопка для подготовки всего к написанию трека" и "кнопка для завершения всего
 *      после написания трека"
 *      - знает, каким классам нужно переадресовать запрос, и какие данные для этого нужны
 *      - можно ввести дополнительный фасад, чтобы не «захламлять» единственный фасад разнородной
 *      функциональностью
 *         - может использоваться как клиентом, так и другими фасадами
 *
 * - сложная подсистема: состоит из множества разнообразных классов
 *      - например, "свет", "компьютер", "Reaper", "Миди устройство"
 *      - чтобы заставить их что-то делать, нужно знать подробности устройства подсистемы, порядок
 *      инициализации объектов и так далее
 *      - классы подсистемы не знают о существовании фасада и работают друг с другом напрямую
 *
 * - клиент: использует фасад вместо прямой работы с объектами сложной подсистемы
 *      - например, я */


/* АДАПТЕР VS ФАСАД
 * - фасад задает новый упрощенный интерфейс, а адаптер повторно использует старый, адаптируясь к
 * нему */


import patterns.structural.facade.complicated_system.Computer;
import patterns.structural.facade.complicated_system.Light;
import patterns.structural.facade.complicated_system.MidiDevice;
import patterns.structural.facade.complicated_system.Reaper;
import patterns.structural.facade.facade.WritingMusicFacade;

/* КЛИЕНТ */
public class Main {

    public static void main(String[] args) {
        WritingMusicFacade writingMusicFacade = new WritingMusicFacade
                (new Computer(), new Reaper(), new MidiDevice(), new Light());


        writingMusicFacade.startProducing();
        writingMusicFacade.finishProducing();
    }
}