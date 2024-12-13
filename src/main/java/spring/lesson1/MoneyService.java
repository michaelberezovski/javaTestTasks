package spring.lesson1;

public class MoneyService {
    private String url;

    private ConverterService converterService;

    private BlaService blaService;

    public MoneyService(String url, ConverterService converterService, BlaService blaService) {
        this.url = url;
        this.converterService = converterService;
        this.blaService = blaService;
    }
}
