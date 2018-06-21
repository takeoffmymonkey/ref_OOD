/* ПРИНЦИП КОМПОЗИЦИОННОГО ОБЪЕКТА: ПРЕДПОЧИТАЙ КОМПОЗИЦИЮ ПЕРЕД НАСЛЕДОВАНИЕМ
 * - в отличие от наследования, композиционный объект не приводит к сильной зацепленности
 *      - но также позволяет переиспользовать код, как и при наследовании
 *
 * - также позволяет динамически менять поведение во время работы
 *      - а наследование является статическим и указывается во время компиляции
 *
 * - но в отличие от наследования, необходимо предоставить все имплементации, без возможности
 * поделиться ими между другими классами
 *
 * - используется, например, в Декораторе и Компоновщике */