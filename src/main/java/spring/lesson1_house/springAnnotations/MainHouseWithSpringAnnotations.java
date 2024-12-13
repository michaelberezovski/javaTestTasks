package spring.lesson1_house.springAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainHouseWithSpringAnnotations {
    public static void main(String[] args) throws IllegalAccessException {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                "spring/lesson1_house/springAnnotations");
        EmailSender someName = context.getBean("someName", EmailSender.class);
        EmailSender someName2 = context.getBean("someName", EmailSender.class);
        someName.send();
        someName2.send();
        ESPrice eSPrice = context.getBean("eprice", ESPrice.class);
        eSPrice.send();

        Messenger messenger = context.getBean("messenger", Messenger.class);
        messenger.sendSecure();

    } //если поставить точку остановки приложения здесь и запустить дебаг
    // , можно увидеть что оба someName ссылаются на один и тот же объект
}
