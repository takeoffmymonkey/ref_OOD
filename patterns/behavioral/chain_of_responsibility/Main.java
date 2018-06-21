package patterns.behavioral.chain_of_responsibility;


/* ЦЕПОЧКА ОБЯЗАННОСТЕЙ: позволяет передавать запросы последовательно по цепочке обработчиков.
 * Каждый последующий обработчик решает, может ли он обработать запрос сам и стоит ли передавать
 * запрос дальше по цепи */


/* ПРИМЕНЕНИЕ:
 * - когда программа должна обрабатывать разнообразные запросы несколькими способами, но заранее
 * неизвестно, какие конкретно запросы будут приходить и какие обработчики для них понадобятся
 * - когда важно, чтобы обработчики выполнялись один за другим в строгом порядке
 * - когда набор объектов, способных обработать запрос, должен задаваться динамически */


/* ПЛЮСЫ
 * - уменьшает зависимость между клиентом и обработчиками
 * - реализует принцип единственной обязанности
 * - реализует принцип открытости/закрытости */


/* МИНУСЫ
 * - запрос может остаться никем не обработанным */


/* СУТЬ РЕАЛИЗАЦИИ
 * - ОБРАБОТЧИК: определяет общий для всех конкретных обработчиков интерфейс
 *      - обычно достаточно описать единственный метод обработки запросов, но иногда здесь может
 *      быть объявлен и метод выставления следующего обработчика
 *
 * - БАЗОВЫЙ ОБРАБОТЧИК: опциональный класс, который позволяет избавиться от дублирования одного и
 * того же кода во всех конкретных обработчиках
 *      - обычно этот класс имеет поле для хранения ссылки на следующий обработчик в цепочке
 *      - клиент связывает обработчики в цепь, подавая ссылку на следующий обработчик через
 *      конструктор или сеттер поля
 *      - также здесь можно реализовать базовый метод обработки, который бы просто перенаправлял
 *      запрос следующему обработчику, проверив его наличие
 *
 * - КОНКРЕТНЫЕ ОБРАБОТЧИКИ: содержат код обработки запросов
 *      - при получении запроса каждый обработчик решает, может ли он обработать запрос, а также
 *      стоит ли передать его следующему объекту
 *      - в большинстве случаев обработчики могут работать сами по себе и быть неизменяемыми,
 *      получив все нужные детали через параметры конструктора
 *
 * - КЛИЕНТ: может либо сформировать цепочку обработчиков единожды, либо перестраивать её
 * динамически, в зависимости от логики программы
 *      - может отправлять запросы любому из объектов цепочки, не обязательно первому из них */


public class Main {
    public static void main(String[] args) {

    }
}