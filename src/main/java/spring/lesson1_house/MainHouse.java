package spring.lesson1_house;

import java.lang.reflect.Field;

public class MainHouse {
    public static void main(String[] args) throws IllegalAccessException {
        House house = new House();
        house.openWindow();
        //так не сработает, тк не проинициализировано само окно6 надо сделать DI(dependency injection)


        // !!!!!!!!!!!!!!!!!!! есть 3 способа сделать DI у спринга их тоже 3

        //   !!!!!!!!! 1) поле field !!!!!!!!!!!

        // у любого класса можно вызвать метаинформацию getClass()
        House house1 = new House();
        Class<? extends House> aClass = house1.getClass(); // спец объект, котор явл-ся объектом рефлексии
        Field[] declaredFields = aClass.getDeclaredFields(); //через эту рефлексию даже без геттеров и сеттеров получить поля
        for (Field declaredField : declaredFields) {
            if (declaredField.equals("widow")) {
                declaredField.set(new Window(12, 12), (1)); // примера ради даже без геттеров и сеттеров
                                                                        // можно положить значение в поле через рефлексию
            }
        }

        // !!!!!!!!!!! 2) Через сеттер, добавив его в House

        // !!!!!!!!!!! 3) Конструктор - самый надежный DI

        // когда мы ручками создам объект мы привязываемся к коду, и в случае, когда мы хотьм
        // поменять параметры у House, нам нужна новая сборка, которая в реальном времени может занимать до 1часа по

        // compilation -> java.class
        // build -> java.jar
        //

    }
}
