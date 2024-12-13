package spring.lesson1;

public class TransferService {
    private MoneyService moneyService;

    private MappingService mappingService;

    public TransferService(MoneyService moneyService, MappingService mappingService) {
        this.moneyService = moneyService;
        this.mappingService = mappingService;
    }
}
