package warriors;

import java.util.ArrayList;
import java.util.Random;

public class Randomizer {

    private static int random() {
        Random rand = new Random();
        return rand.nextInt(3);
    }

    private static Character generateCharacter(String name, String weapon, int attack) {
        return new Character(name, weapon, attack);
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> weapon = new ArrayList<>();
        ArrayList<Integer> attack = new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        weapon.add("axe");
        weapon.add("rifle");
        weapon.add("ICBM");
        attack.add(1);
        attack.add(2);
        attack.add(3);
        System.out.println(generateCharacter(names.get(random())
                , weapon.get(random())
                , attack.get(random())));
    }
}
