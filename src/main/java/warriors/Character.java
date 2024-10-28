package warriors;

public class Character {
    private String name;

    private String weapon;

    private int attack;

    public Character(String name, String weapon, int attack) {
        this.name = name;
        this.weapon = weapon;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", attack=" + attack +
                '}';
    }
}
