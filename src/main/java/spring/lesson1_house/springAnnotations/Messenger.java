package spring.lesson1_house.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:withAnnotations/propsForESPrice")
public class Messenger {
    //@Autowired - его я закомментил, чтобы вместо @Autowired который будет выполнять автоподставление,
    // вместо пишем @PropertySource

    // @Qualifier("smsSender") явно указываем какого из имплементоров использовать, так можно
    // но это привязка к кодовой базе, так как мы снова прописываем ручками в коде и в случае чего надо будет перекомпилировать

    // чтобы отвязаться от кода и сделать зависимость на сторонний файл6 лезем в propsForESPrice(в нашем случае)
    // и там прописываем
    @Value("${messenger.type}") // 1) создали поле, куда будет подтянуто значение из конфиг файла
    private String messengerType;
    private Sender sender;

    // без конструктора упадёт nullpointer, поэтому варианта 2, либо создать конструктор Messanger{EmailSender sender}
    // и тогда спринг подтянет поле
    // либо запилить аннотацию @Autowired
    // так же можно сделать через сеттер, тоде поставить аннотацию @Autowired тогда всё соберется

    public void sendSecure() {
        System.out.println("SSL");
        sender.send();
    }

    @Autowired
    public void setSender(ApplicationContext context) { // 2) создаем сеттер который дергает тип класса через AppContext
        sender = context.getBean(messengerType, Sender.class);
        // которому спринг в свою очередь подтягивает значение через @value messengerType
    }
}
