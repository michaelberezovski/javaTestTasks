package spring.lesson1_house.withSpringXMLsetting;

public class WoodenWindow extends WindowSpring {
    public WoodenWindow(int height, int width) {
        super(height, width);
        System.out.println("спринг дернул конструктор");
    }

    @Override
    public void open() {
        System.out.println("Wood Window open with params " + getHeight() + " " + getWidth());
    }
}
