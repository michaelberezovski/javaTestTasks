package musician;

public class Musician {
    private Instrument instrument;

    public Musician(Instrument instrument) {
        this.instrument = instrument;
    }

    public void startPlay() {
        System.out.println("Берем в руки инструмент");
        instrument.play();
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
