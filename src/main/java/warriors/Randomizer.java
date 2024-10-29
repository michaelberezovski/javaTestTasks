package warriors;

import java.util.ArrayList;
import java.util.Random;

public class Randomizer {

    private final static String[] names = {"a", "b", "c"};
    private final static String[] weapon = {"axe", "rifle", "ICBM"};
    private final static Integer[] attack = {1, 2, 3};

    private static Random rand = new Random();

    private static int random() {
        return rand.nextInt(3);
    }

    private static Character generateCharacter(String name, String weapon, int attack) {
        return new Character(name, weapon, attack);
    }

    public static void main(String[] args) {
        System.out.println(generateCharacter(names[random()]
                , weapon[random()]
                , attack[random()]));
    }
}
