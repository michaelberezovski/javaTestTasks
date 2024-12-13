package spring.lesson1_house.withSpringXMLsetting;

public class HouseSpring {
    private WindowSpring window;

    public HouseSpring(WindowSpring window) {
        this.window = window;
    }

    public void openWindow() {
        System.out.println("come to window");
        window.open();
    }
}
