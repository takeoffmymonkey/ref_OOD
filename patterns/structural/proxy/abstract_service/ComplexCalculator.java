package patterns.structural.proxy.abstract_service;


/* ИНТЕРФЕЙС СЕРВИСА: определяет общий интерфейс для сервиса и заместителя
 * - благодаря этому, объект заместителя можно использовать там, где ожидается объект сервиса */


public interface ComplexCalculator {
    void calculate();
}
