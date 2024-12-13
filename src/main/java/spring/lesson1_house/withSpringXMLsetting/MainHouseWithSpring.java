package spring.lesson1_house.withSpringXMLsetting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainHouseWithSpring {
    public static void main(String[] args) throws IllegalAccessException {
        //основная теория в пакете выше
        //про IoC(Inversion of control)
        //класс верхнего уровня должен быть слабо связан с классом нижнего
        //в пакете выше мы можем положит в House только объект Window, что является жесткой связкой
        //для решения этой проблемы сделаем Window в этом пакете абстрактным

        // есть 2-3 способа созаия бинов, кто-то второй разделяет на 2 дополнительных

        //1) ApplicationContext, создаём xml файл в ресурсах
        ApplicationContext context = new ClassPathXmlApplicationContext("withApplicationContextFile/appcontext.xml");
        //WoodenWindow woodWindow = context.getBean("woodWindow", WoodenWindow.class);//по умолчанию возвращает Object
        // но чтобы не делать кастинг проще сразу запихнуть .class
        //woodWindow.open();

        //итого у нас не меняется источник кода и его не надо будет перекомпилировать в случае изменения параметров окна
        // мы просто меняем xml файл, перезагружаем приложение и всё работает с новыми данными

        // мы добавили в конфигурационный файл еще один бин House, в который положили PlasticWindow
        HouseSpring house = context.getBean("house", HouseSpring.class);
        house.openWindow();

    }
}
