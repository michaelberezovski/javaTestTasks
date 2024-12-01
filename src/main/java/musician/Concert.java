package musician;

public class Concert {
    public static void main(String[] args) {
        Piano piano = new Piano();
        Guitar guitar = new Guitar();
        Musician musician = new Musician(piano);
        musician.startPlay();
        musician.setInstrument(guitar);
        musician.startPlay();
    }
}
