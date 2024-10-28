package battle;

import java.util.Objects;

public class Warrior {

    private int Name;
    private int Health;

    public Warrior(int name, int health) {
        Name = name;
        Health = health;
    }

    public int getName() {
        return Name;
    }

    public void setName(int name) {
        Name = name;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Warrior warrior = (Warrior) o;
        return Name == warrior.Name && Health == warrior.Health;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Health);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "Name=" + Name +
                ", Health=" + Health +
                '}';
    }
}
