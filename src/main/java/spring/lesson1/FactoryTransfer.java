package spring.lesson1;

public class FactoryTransfer {
    public static TransferService getTransferService() {
        return new TransferService(
                new MoneyService("djd", new ConverterService(1, "fofo"), new BlaService(3)),
                new MappingService(44));
    }
}
