package patterns.structural.proxy.service_proxy;

import patterns.structural.proxy.abstract_service.ComplexCalculator;
import patterns.structural.proxy.concrete_service.Calculator;


/* ЗАМЕСТИТЕЛЬ: хранит ссылку на объект сервиса
 *
 * - после того как заканчивает свою работу (например, инициализацию, логирование, защиту или другое),
 * он передаёт вызовы вложенному сервису
 *
 * - может сам отвечать за создание и удаление объекта сервиса */


public class CalculatorProxy implements ComplexCalculator {
    Calculator c = new Calculator();

    @Override
    public void calculate() {
        System.out.println("Calculating...");

        new Thread(new Runnable() {
            @Override
            public void run() {
                c.calculate();
            }
        }).start();

        System.out.println("Meanwhile doing smth other.. ");
    }
}
