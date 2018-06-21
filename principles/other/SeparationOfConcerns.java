package principles.other;

/* РАЗДЕЛЕНИЕ ПРЕДМЕТОВ БЕСПОКОЙСТВА
 * - предмет беспокойства - все, что важно для обеспечения решения конкретной проблемы */


/* ПОЗВОЛЯЮТ РАЗДЕЛИТЬ СИСТЕМУ НА НЕЗАВИСИМЫЕ ЗОНЫ
 * - можно отдельно работать над каждой
 *      - все изменения касаются только данной зоны
 * - не нужно знать, как работают другие */


/* РАЗДЕЛЕНИЕ ПРОИСХОДИТ ПРИ:
 * - абстракции
 *      - выделение свойств и атрибутов концепции
 * - инкапсуляции
 *      - отделение интерфейса и имплементации
 * - декомпозиции
 *      - выделение мелких классов из 1 большого
 * - генерализации
 *      - выделение общностей в суперкласс/метод/интерфейс */

public class SeparationOfConcerns {
    /*БЫЛО*/
    class SmartPhone {
        byte camera;
        byte phone;

        void takePhoto() {
        }

        void makeCall() {
        }
    }


    /*СТАЛО*/
    interface ICamera {
        void takePhoto();
    }

    interface IPhone {
        void makeCall();
    }

    class TradionalPhone implements IPhone {

        @Override
        public void makeCall() {
        }
    }

    class FirstGenCamera implements ICamera {
        @Override
        public void takePhoto() {
        }
    }

    class SmartPhone2 {
        ICamera camera;
        IPhone phone;

        public SmartPhone2(ICamera camera, IPhone phone) {
            this.camera = camera;
            this.phone = phone;
        }

        void useCamera() {
            camera.takePhoto();
        }

        void usePhone() {
            phone.makeCall();
        }
    }
}