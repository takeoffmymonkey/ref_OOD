package patterns.structural.composite.client_main;

import patterns.structural.composite.abstract_component.FolderComponent;
import patterns.structural.composite.concrete_leaf.File;
import patterns.structural.composite.concrete_node.Folder;

import java.util.ArrayList;


/* КОМПОНОВЩИК: объединяет объекты в древовидную структуру для представлений иерархий "часть/целое"
 *
 * - позволяет клиенту выполнять однородные операции с отдельными объектами и их совокупностями
 *
 * - все компоненты должны реализовывать один интерфейс, но листья и узлы обычно имеют разные роли
 *      - поэтому какие-то методы будут общими, а какие-то не обходимо будет переопределять в
 *      реализациях
 *          - следовательно часть методов будет не релевантной для определенной реализации
 *              - поэтому методы, различные для листьев и узлов, могут по дефолту выбрасывать
 *              исключение типа UnsupportedOperationException или возвращать false или null
 *                  - можно также выделить их в отдельные интерфейсы
 *              - в любом из вариантов нужно будет делать проверку с помощью try/catch, boolean, null
 *              или опрератора instanceof (если все же вылелять их в интерфейсы) */


/* ПРИМЕНЕНИЕ
 * - когда нужно представить древовидную структуру объектов
 *
 * - когда клиенты должны единообразно трактовать простые и составные объекты */


/* ПЛЮСЫ
 * - упрощает архитектуру клиента при работе со сложным деревом компонентов
 *
 * - облегчает добавление новых видов компонентов */


/* МИНУСЫ
 * - создаёт слишком общий дизайн классов */


/* СУТЬ РЕАЛИЗАЦИИ
 * - АБСТРАКЦИЯ КОМПОНЕНТА: определяет общий интерфейс для простых и составных компонентов дерева
 *      - для методов, которые могут быть нерелевантными для какой-то из реализаций, по дефолту при
 *      его вызове стоит вызывать UnsupportedOperationException
 *
 * - ЛИСТ: простой компонент дерева, не имеющий ответвлений
 *      - из-за того, что им некому больше передавать выполнение, классы листьев будут содержать
 *      большую часть полезного кода
 *      - может хранить ссылку на свой узел
 *          - например, при удалении листа, необходимо будет подняться на уровень узла
 *
 * - КОНТЕЙНЕР (УЗЕЛ, КОМПОЗИТ): составной компонент дерева
 *      - содержит набор дочерних компонентов, но ничего не знает об их типах
 *         - это могут быть как простые компоненты-листья, так и другие компоненты-контейнеры
 *             - не является проблемой, если все дочерние компоненты следуют единому интерфейсу
 *      - методы контейнера переадресуют основную работу своим дочерним компонентам, хотя и могут
 *      добавлять что-то своё к результату
 *
 * - КЛИЕНТ: работает с деревом через общий интерфейс компонентов
 *     - клиенту не важно, что перед ним находится — простой или составной компонент дерева */


/* КЛИЕНТ */
public class Main {

    public static void main(String[] args) {
        ArrayList<FolderComponent> folderComponents = new ArrayList<>();

        FolderComponent folder1 = new Folder("Folder 1");
        FolderComponent file1 = new File("File 1");
        folder1.addComponent(file1);


        FolderComponent folder2 = new Folder("Folder 2");
        FolderComponent file2 = new File("File 2");
        folder2.addComponent(file2);
        FolderComponent folder3 = new Folder("Folder 3");
        folder2.addComponent(folder3);
        FolderComponent file3 = new File("File 3");
        FolderComponent file4 = new File("File 4");
        folder3.addComponent(file3);
        folder3.addComponent(file4);


        folderComponents.add(folder1);
        folderComponents.add(folder2);


        for (FolderComponent folderComponent : folderComponents) {
            folderComponent.print();
        }
    }
}