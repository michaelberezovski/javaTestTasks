package spring.lesson1_house.withSpringXMLsetting;

public class PlasticWindow extends WindowSpring {
    public PlasticWindow(int height, int width) {
        super(height, width);
    }

    @Override
    public void open() {
        System.out.println("Wood Window open with params " + getHeight() + " " + getWidth());
    }
}
