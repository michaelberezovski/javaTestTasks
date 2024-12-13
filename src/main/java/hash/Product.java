package hash;

import java.util.Objects;

public abstract class Product {
    private final String name;
    private final String manufacturer;
    private int numberOfProducts;

    public Product(String name, String manufacturer, int numberOfProducts) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.numberOfProducts = numberOfProducts;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return numberOfProducts == product.numberOfProducts && Objects.equals(name, product.name) && Objects.equals(manufacturer, product.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, manufacturer, numberOfProducts);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", numberOfProducts=" + numberOfProducts +
                '}';
    }
}
