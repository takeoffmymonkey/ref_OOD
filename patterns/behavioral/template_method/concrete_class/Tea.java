package patterns.behavioral.template_method.concrete_class;

import patterns.behavioral.template_method.abstract_class.CaffeineBeverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* КОНКТРЕТНЫЙ КЛАСС: переопределяет некоторые (или все) шаги алгоритма
 *
 * - конкретные классы не переопределяют сам шаблонный метод */


public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Brewing tea in hot water");
    }


    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }


    @Override
    public boolean customerWantsCondiments() { // переопределение метода-перехватчика
        return getUserInput().toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;

        System.out.print("Would you like lemon with your tea (y/n)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();

        } catch (IOException e) {
            System.out.println("IO error");
        }

        if (answer == null) {
            return "no";
        }
        return answer;
    }
}