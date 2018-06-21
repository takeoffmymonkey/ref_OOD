package principles.main;

import java.util.Date;

/* ИНКАПСУЛЯЦИЯ - УПАКОВКА СВОЙСТВ И ОБЯЗАННОСТЕЙ КОНЦЕПЦИИ В ЕДИНУЮ СУЩНОСТЬ (КЛАСС)
 * - свойства и обязанности были вычленены на стадии абстракции */


/* ИДЕИ ИНКАПСУЛЯЦИИ:
 *  1. группировка аттрибутов и методов (которые ими манипулируют) в полноценные объекты
 *  2. предоставление доступа к определенным данным и методам объекта извне
 *  3. ограничение доступа к определенным данным и методам объекта извне*/


/* ОБЕСПЕЧИВАЕТ:
 * - сохранность данных
 *      - класс по сути является black box
 *
 * - удобство работы с классом
 *      - все связанные данные и методы находятся рядом
 *
 * - гибкость имплементации
 *      - имплементация может меняться, при этом интерфейс остается прежним
 *          - т.к. класс является black box */


public class Encapsulation {

    class Food {
        private String groceryID;
        private String name;
        private String manufacturer;
        private Date expiryDate;
        private double price;

        public Food(String name) { //целостность
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public boolean isOnSale(Date date) {
            return true;
        }
    }
}
