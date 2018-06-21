package patterns.behavioral.observer.concrete_observer;

import patterns.behavioral.observer.abstract_observable.Observable;
import patterns.behavioral.observer.abstract_observer.Observer;
import patterns.behavioral.observer.concrete_observable.WeatherData;

/* КОНКРЕТНЫЙ НАБЛЮДАТЕЛЬ
 * - имеет ссылку на свой субъект, получает ее при своем создании
 * - при создании также регистрируется у субъекта
 * - метод update() вызывается субъектом, когда данные обновляются
 *      - метод принимает ссылку на данный субъект, чтобы можно было его отличить от других субъектов
 *      - вызывается метод получения данных у субъекта */

public class WeatherDisplay implements Observer {
    private Observable observable;
    private int temperature;

    public WeatherDisplay(Observable observable) {
        this.observable = observable; // сохранение ссылки на субъект
        observable.registerObserver(this); // регистрация данного наблюдателя в субъекте
    }

    @Override
    public void update(Observable observable) { // вызывается наблюдателем при получении обновлений
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            temperature = weatherData.getTemperature(); // запрашиваем температуру у субъекта
            System.out.println("Наблюдатель " + this + " получил новую температуру: " + temperature);
        }
    }
}