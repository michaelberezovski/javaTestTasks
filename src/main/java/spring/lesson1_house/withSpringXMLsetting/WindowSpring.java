package spring.lesson1_house.withSpringXMLsetting;

public abstract class WindowSpring {
     private int height;
     private int width;

    public WindowSpring(int height, int width) {
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

    public abstract void open();
}
