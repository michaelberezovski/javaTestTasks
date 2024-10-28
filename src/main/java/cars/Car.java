package cars;

import java.util.Objects;

public class Car {

    private String brand;
    private int mileage;
    private Engine engine;


    public Car(String brand, int mileage, Engine engine) {
        this.brand = brand;
        this.mileage = mileage;
        this.engine = engine;
    }

    public void startMove(Car car, int mileage) {
        if (car.getEngine().getDurability() <= 0) {
            System.out.println("Теперь вы пешеход");
        } else {
            int engineDepreciation = 10;
            int engineState = 100;
            car.getEngine().setDurability(engineState - engineDepreciation * (mileage % 1000));
        }
    }

    public String showEngineInfo(Car car) {
        return "Current engine state is:" + car.getEngine().getDurability();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car brand: " + brand + "\n mileage: " + mileage + "\n engine: " + engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return mileage == car.mileage && Objects.equals(brand, car.brand) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, mileage, engine);
    }
}
