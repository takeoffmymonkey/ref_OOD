package patterns.structural.flyweight;


/* ЛЕГКОВЕС: позволяет вместить бóльшее количество объектов в отведённую оперативную память
 * - экономит память, разделяя общее состояние объектов между собой, вместо хранения одинаковых
 * данных в каждом объекте */


/* ПРИМЕНЕНИЕ:
 * - когда не хватает оперативной памяти для поддержки всех нужных объектов */


/* ПЛЮСЫ
 * - экономит оперативную память */


/* МИНУСЫ
 * - расходует процессорное время на поиск/вычисление контекста
 * - усложняет код программы из-за введения множества дополнительных классов */


/* СУТЬ РЕАЛИЗАЦИИ
 * - Вы всегда должны помнить о том, что Легковес применяется в программе, имеющей громадное
 * количество одинаковых объектов
 *      - этих объектов должно быть так много, чтобы они не помещались в доступную оперативную
 *      память без ухищрений
 *      - паттерн разделяет данные этих объектов на две части — легковесы и контексты
 *
 * - ЛЕГКОВЕС: содержит состояние, которое повторялось во множестве первоначальных объектов
 *      - один и тот же легковес можно использовать в связке со множеством контекстов
 *      - состояние, которое хранится здесь, называется внутренним, а то, которое он получает извне -
 *      внешним
 *
 * - КОНТЕКСТ: содержит «внешнюю» часть состояния, уникальную для каждого объекта
 *      - контекст связан с одним из объектов-легковесов, хранящих оставшееся состояние
 *
 * - Поведение оригинального объекта чаще всего оставляют в Легковесе, передавая значения контекста
 * через параметры методов
 *      - тем не менее, поведение можно поместить и в контекст, используя легковес как объект данных
 *
 * - КЛИЕНТ: вычисляет или хранит контекст, то есть внешнее состояние легковесов
 *      - для него легковесы выглядят как шаблонные объекты, которые можно настроить во время
 *      использования, передав контекст через параметры
 *
 * - ФАБРИКА ЛЕГКОВЕСОВ: управляет созданием и повторным использованием легковесов
 *      - получает запросы, в которых указано желаемое состояние легковеса
 *          - если легковес с таким состоянием уже создан, фабрика сразу его возвращает, а если нет -
 *          создаёт новый объект */


public class Main {
    public static void main(String[] args) {

    }
}