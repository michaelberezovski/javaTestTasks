package fight2;

import java.util.Objects;

public class Warrior2 {

    private int Name;

    private int Health;

    private final int Damage = 20;

    public Warrior2(int name, int health) {
        Name = name;
        Health = health;
    }

    public boolean kick(Warrior2 warrior2) {
        warrior2.setHealth(warrior2.getHealth() - getDamage());
        System.out.println("Warrior " + getName() + " attacked");
        System.out.println("Remaining warrior " + warrior2.getName() + " heath is: " + warrior2.getHealth());
        if (warrior2.getHealth() <= 0) {
            System.out.println("Warrior " + warrior2.getName() + " is dead");
            System.out.println("Warrior " + getName() + " has won");
            return true;
        }
        return false;
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

    public int getDamage() {
        return Damage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Warrior2 warrior2 = (Warrior2) o;
        return Name == warrior2.Name && Health == warrior2.Health;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Health, Damage);
    }

    @Override
    public String toString() {
        return "Warrior2{" +
                "Name=" + Name +
                ", Health=" + Health +
                ", Damage=" + Damage +
                '}';
    }
}
