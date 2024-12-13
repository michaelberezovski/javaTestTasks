package spring.lesson1;


import static spring.lesson1.FactoryTransfer.getTransferService;

public class MainTransferService {
    public static void main(String[] args) {

        //проблема в моздании кажый раз подобной бороды ручками, что очень накладно
        TransferService o = new TransferService(
                        new MoneyService("djd", new ConverterService(1, "fofo"), new BlaService(3)),
                        new MappingService(44));
        //если подобный сервис надо будет заюзать где-то еще, то придется снова коврять всё вручную
        //вариант вынести создание в отельный клас фабрику
        TransferService s = getTransferService();
        //когда мы выносим подобный метод в фабрику, возникает следующая пробема, фабрика инициализирует создание множества
        // объектов что в приложении на 1млн человек выдаст очень мощную нагрузку на систему


        //существует паттерн Singleton, который рассчитан как раз на то, чтобы создать подобный объект в единственном
        // экземпляре
    }
}
