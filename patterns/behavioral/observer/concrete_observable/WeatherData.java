package patterns.behavioral.observer.concrete_observable;

import patterns.behavioral.observer.abstract_observable.Observable;
import patterns.behavioral.observer.abstract_observer.Observer;

import java.util.ArrayList;
import java.util.List;

/* КОНКРЕТНЫЙ СУБЪЕКТ
 * - реализует методы интерфейса
 * - имеет список из зарегистрированных наблюдателей
 * - имеет поле и метод для установки данных
 * - имеет метод для предосталения данных
 * - имеет поле и метод для проверки, было ли изменение данных */


public class WeatherData implements Observable {
    private int temperature;
    private List<Observer> observers; // список со всеми зарегистрированными наблюдателями
    private boolean changed; // проверка, что данные таки изменились

    public WeatherData() {
        observers = new ArrayList<>();
    }

    /* Этот метод вызывается кем-то, кто поставляет новую температуру данному классу */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        temperatureChanged(); // вызов метода, который МОЖЕТ инициировать оповещение
    }

    public int getTemperature() { // вызывается сами наблюдателями при получении оповещения
        return temperature;
    }

    public void temperatureChanged() {
        setChanged(true);
        notifyObservers(); // оповещение о смене температуры для наблюдателей
    }

    private void setChanged(boolean changed) {
        this.changed = changed;
    }


    @Override
    public void registerObserver(Observer observer) { // добавление нового наблюдателя
        observers.add(observer);
        System.out.println("Зарегистрирован наблюдатель: " + observer);
    }

    @Override
    public void removeObserver(Observer observer) { // удаление указанного наблюдателя
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
            System.out.println("Удален наблюдатель: " + observer);
        }
    }

    @Override
    public void notifyObservers() { // оповещение всех наблюдателей
        if (changed) { // при условии, что данные изменились
            for (Observer observer : observers) {
                observer.update(this);
            }
            changed = false;
        }
    }
}