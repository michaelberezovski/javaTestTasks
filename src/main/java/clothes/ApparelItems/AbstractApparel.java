package clothes.ApparelItems;

import clothes.Sizes;

import java.util.Objects;

public abstract class AbstractApparel {
    private Sizes size;
    private int price;
    private String colour;

    public AbstractApparel(Sizes size, int price, String colour) {
        this.size = size;
        this.price = price;
        this.colour = colour;
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractApparel that = (AbstractApparel) o;
        return price == that.price && size == that.size && Objects.equals(colour, that.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, price, colour);
    }

    @Override
    public String toString() {
        return "AbstractApparel{" +
                "size=" + size +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
