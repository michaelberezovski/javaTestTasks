package spring.lesson1_house.springAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:withAnnotations/propsForESPrice")
public class SmsSender implements Sender {
// в Messenger подходят два бина Емейл и СМС, поэтому надо либо указать в Messenger @Qualifier("emailSender")
    @Value("${sms.price}")
    private int price;

    @Override
    public void send() {
        System.out.println("send sms" + price);
    }
}
