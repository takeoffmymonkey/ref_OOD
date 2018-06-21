package patterns.structural.proxy.concrete_service;

import patterns.structural.proxy.abstract_service.ComplexCalculator;


/* СЕРВИС: содержит полезную бизнес-логику */


public class Calculator implements ComplexCalculator {
    @Override
    public void calculate() {
        long l = 0;
        for (int i = 0; i < 1000000000; i++) {
            l++;
        }
        System.out.println("Result:" + l);
    }
}
