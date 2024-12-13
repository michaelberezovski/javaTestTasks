package spring.lesson1_house;

public class Window {
     private int height;
     private int width;

    public Window(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void open() {
        System.out.println("Window open with params " + getHeight() + " " + getWidth());
    }
}
