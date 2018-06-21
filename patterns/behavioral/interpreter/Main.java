package patterns.behavioral.interpreter;


/* ИНТЕРПРЕТАТОР: для заданного языка определяет представление его грамматики, а также интерпретатор
 * предложений этого языка */


/* ПРИМЕНЕНИЕ:
 * - когда некоторая задача возникает часто, то имеет смысл представить ее конкретные проявления в
 * виде предложений на простом языке
 *      - затем можно будет создать интерпретатор, который решает задачу, анализируя предложения
 *      этого языка
 *
 * - когда есть язык для интерпретации, предложения которого можно представить в виде абстрактных
 * синтаксических деревьев */


/* ПЛЮСЫ
 * - представление правил грамматики в виде классов упрощает реализацию языка
 * - можно легко изменять и расширять язык
 * - включение дополнительных методов в структуру классов позволяет добавлять новое поведение, не
 * связанное с интерпретацией
 *      - например, форматированный вывод или проверка корректности интерпретируемого кода */


/* МИНУСЫ
 * - при большом количестве правил реализация становится слишком громоздкой
 *      - тогда лучше воспользоваться парсером/компилятором */


/* СУТЬ РЕАЛИЗАЦИИ
 * - АБСТРАКТНОЕ ВЫРАЖЕНИЕ: объявляет абстрактную операцию Interpret, общую для всех узлов в
 * абстрактном синтаксическом дереве
 *
 * - ТЕРМИНАЛЬНОЕ ВЫРАЖЕНИЕ: реализует операцию Interpret для терминальных символов грамматики
 *      - необходим отдельный экземпляр для каждого терминального символа в предложении
 *
 * - НЕТЕРМИНАЛЬНОЕ ВЫРАЖЕНИЕ: по одному такому классу требуется для каждого грамматического правила
 *      - хранит переменные экземпляра типа AbstractExpression для каждого символа
 *      - реализует операцию Interpret для нетерминальных символов грамматики
 *          - эта операция рекурсивно вызывает себя же для переменных
 *
 * - КОНТЕКСТ: содержит информацию, глобальную по отношению к интерпретатору
 *
 * - КЛИЕНТ: строит (или получает в готовом виде) абстрактное синтаксическое дерево, представляющее
 * отдельное предложение на языке с данной грамматикой
 *      -  дерево составлено из экземпляров классов Nonterminal-Expression и Terminal-Expression
 *      - вызывает операцию Interpret*/


public class Main {
    public static void main(String[] args) {

    }
}