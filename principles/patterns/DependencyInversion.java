/* ИНВЕРСИЯ ЗАВИСИМОСТЕЙ: КОД ДОЛЖЕН ЗАВИСЕТЬ ОТ АБСТРАКЦИЙ, А НЕ ОТ КОНКРЕТНЫХ КЛАССОВ
 * - т.е. от абстрактных классов и интерфейсов, а не конкретных классов
 *
 * - исходит от принципа слабой связанности
 *
 * - похож на принцип программирования на уровне интерфейсов, но предъявляет более жесткие
 * требования к абстракции: высокоуравневые компоненты не должны зависеть от низкоуравневых
 *      - и те и другие должны зависеть от абстракций
 *
 * - инверсия, потому что сначала абстракция зависела от низкоуравневых компонентов, а должно стать
 * наоборот
 *
 * - советы по применению:
 *      - ссылки на конкретные классы не должны храниться в переменных конкретного типа
 *          - нужно использовать Фабрику
 *      - в архитектуре классы должны быть производными от абстракций, а не конкретных классов
 *          - такое наследование создает дополнительную зависимость
 *      - методы подклассов не должны переопределять методы, реализованные в каких-либо из его
 *      базовых классов
 *          - если переопределяется реализованный метод, значит он был плохой абстракцией
 *          - методы, реализованные в базовом классе, должны использоваться всеми подклассами */