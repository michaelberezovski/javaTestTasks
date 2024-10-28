package cars;

import java.util.ArrayList;

public class CarService {

    public static void repairEngine(Car car) {
        car.setEngine(new Engine(100));
    }

    public static ArrayList<Car> repairWorstEngine(ArrayList<Car> list) {
        Car worstCar = null;
        int worstEngine = 100;
        for (Car car : list) {
            if (car.getEngine().getDurability() < worstEngine) {
                worstEngine = car.getEngine().getDurability();
                worstCar = car;
            }
        }
        if (worstCar == null) {
            System.out.println("no cars to repair");
            return list;
        }
        repairEngine(worstCar);
        return list;
    }

    public static void printList(ArrayList<Car> list) {
        for (Car car : list) {
            System.out.println(car +"\n");
        }
        System.out.println("!! end of the list\n");
    }

    public static void main(String[] args) {
        Car car1 = new Car("one", 2000, new Engine(80));
        Car car2 = new Car("two", 3000, new Engine(70));
        Car car3 = new Car("three", 9000, new Engine(10));
        Car car4 = new Car("four", 5000, new Engine(50));
        Car car5 = new Car("five", 8000, new Engine(20));
        ArrayList<Car> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);
        repairWorstEngine(list);
        printList(list);
        repairWorstEngine(list);
        printList(list);
        repairWorstEngine(list);
        printList(list);
        repairWorstEngine(list);
        printList(list);
    }
}
