package spring.lesson1;

public class TransferFactorySingleton {

    //тут просто кидаем ссылку на объект через геттер
    // + соответствует концепции fail-fast, то есть при запуске приложения он будет проинициализирован
    // и при запуске в случае косяка приложение упадёт сразу, а не в процессе работы, когда к неу обратится кто-нибудь
    private static TransferService transferService1 = new TransferService(
            new MoneyService("djd", new ConverterService(1, "fofo"), new BlaService(3)),
            new MappingService(44));
    //но, проблематеперь в другом данный синглтон нужен на каждый из вложенных сервисов, а их может быть куда больше

    public static TransferService getTransferService1() {
        return transferService1;
    }
}
