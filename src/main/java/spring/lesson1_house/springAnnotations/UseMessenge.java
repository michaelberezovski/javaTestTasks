package spring.lesson1_house.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UseMessenge {
    @Autowired //снова аннотация, которая сама автоматически подтянет всё для создания бина
    private Messenger messenger;
}
