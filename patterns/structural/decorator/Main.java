package patterns.structural.decorator;

import patterns.structural.decorator.abstract_component.Beverage;
import patterns.structural.decorator.concrete_component.Espresso;
import patterns.structural.decorator.concrete_decorator.Mocha;
import patterns.structural.decorator.concrete_decorator.Soy;

/* ДЕКОРАТОР: динамически наделяет объект новыми возможностями и является гибкой альтернативой
 * субклассированию в области расширения функциональности
 *
 * - декоратор также можно назвать оберткой */


/* ПРИМЕНИМОСТЬ
 * - когда нужно добавлять обязанности объектам на лету, незаметно для кода, который их использует
 * - когда нельзя расширить обязанности объекта с помощью наследования */


/* ПЛЮСЫ
 * - большая гибкость, чем у наследования
 * - позволяет добавлять обязанности на лету
 * - можно добавлять несколько новых обязанностей сразу
 * - позволяет иметь несколько мелких объектов вместо одного объекта на все случаи жизни */


/* МИНУСЫ
 * - трудно конфигурировать многократно обёрнутые объекты
 * - обилие крошечных классов */


/* СУТЬ РЕАЛИЗАЦИИ:
 * - абстракция для компонента, который будет декорироваться дополнительным фунционалом
 *      - например: напиток + метод получения цены
 *
 * - разные конкретные реализации абстракции компонента
 *      - например: кофе, чай + метод получения цены со своей ценой
 *
 * - абстракция для декоратора, т.е. того, что будет представлять дополнительную функцию
 *      - например: добавки
 *      - также должна наследоваться от абстракции компонента, чтобы ее можно было в итоге выдать за
 *      реальный компонент
 *      - содержит ссылку на любой компонент, к которому она добавляется
 *
 * - разные конкретные реализации абстракции декоратора
 *      - например: молоко, соя + метод получения цены со своей ценой + вызов метода получения цены
 *      компонента, к которому добавлен данный декоратор
 *
 * - т.е. 1 конкретный компонент заворачивается в декоратор, а тот может заворачиваться в следующий
 * и т.д. для добавления новой фунции, при этом внешний объект (уже декоратор) все еще остается
 * нужного типа, а его методы по цепочке вызывают аналогичные методы всех вложенных компонентов
 * /декораторов */


/* ИЗВЕСТНОЙ РЕАЛИЗАЦИЕЙ ДЕКОРАТОРА ЯВЛЯЕТСЯ ПАКЕТ JAVA.IO
 * - напр. вызов: (LineNumberInputStream(BufferedInputStream(FileInputStream)))
 *      - где:
 *          - FileInputStream: базовый декорируемый компонент
 *              - другие компоненты в пакете: StringBufferInputStream, ByteArrayInputStream
 *
 *          - BufferedInputStream: конкретный декоратор
 *              - бууферизует ввод, добавляет метод построчного чтения
 *
 *          - LineNumberInputStream: конкретный декоратор
 *              - добавляет возможность подсчета строк в процессе чтения
 *
 *
 * - например, архитектура ВВОДА в пакете IO:
 *      - InputStream: абстрактный компонент
 *          - реализации: FileInputStream, StringBufferInputStream, ByteArrayInputStream
 *
 *      - FilterInputStream: абстрактный декоратор
 *          - реализации: PushbackInputStream, BufferedInputStream, DataInputStream,
 *          LineNumberInputStream
 *
 *
 * - например, чтобы получить класс, который меняет в тексте заглавные символы на строчные, нужно
 * унаследовать абстракцию декоратора FilterInputStream и переопределить 2 метода read(), в которых
 * производить замену
 *      - при создании объекта использовать в сочетании с декоратором BufferedInputStream */


public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso(); // сам кофе
        Beverage beverage1 = new Soy(beverage); // кофе с дополнением 1
        Beverage beverage2 = new Mocha(beverage1); // кофе с дополнением 1 и 2

        System.out.println("Order: " + beverage2.getDescription()); // Espresso, Soy, Mocha
        System.out.println("Price: " + beverage2.cost()); // 2.29
    }
}