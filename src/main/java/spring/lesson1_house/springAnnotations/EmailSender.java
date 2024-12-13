package spring.lesson1_house.springAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

// спринг когда увидит этот класс, просканирует указанный пакет, увидит аннотацию, дернет конструктор и созаст этот объект
// спринг дергает конструктор, создает объект(бин) под айдишником названия класса с маленькой буквы "emailSender"
//либо у аннотации в скобках прописать свой @Component(value = "someName"))
@Component(value = "someName")
@PropertySource("classpath:withAnnotations/propsForESPrice")
public class EmailSender implements Sender {
    @Value("${email.price}")
    private int price;
    public EmailSender() {
        System.out.println("spring has created an object");
    }

    public void send() {
        System.out.println("send email " + price);
    }
}
