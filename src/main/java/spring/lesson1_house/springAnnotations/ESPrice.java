package spring.lesson1_house.springAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component(value = "eprice")
@PropertySource("classpath:withAnnotations/propsForESPrice") //здесь для потдягивания нужного значения в прайс указываем путь
// на файлик с параметрами, который может лежать где угодно
public class ESPrice {

    @Value("${email.price}") //а здесь указываем название параметра, которое ему необходимой найти
    private int price;

    public void send() {
        System.out.println("send email " + price);
    }
}
