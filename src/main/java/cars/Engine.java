package cars;

import java.util.Objects;

public class Engine {

    private int Durability;

    public Engine(int durability) {
        Durability = durability;
    }

    public int getDurability() {
        return Durability;
    }

    public void setDurability(int durability) {
        Durability = durability;
    }

    @Override
    public String toString() {
        return "Durability=" + Durability + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Engine engine = (Engine) o;
        return Durability == engine.Durability;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Durability);
    }
}
