package fight2;

import battle.Warrior;

import java.util.ArrayList;
import java.util.Random;

public class Fight2 {

    private static ArrayList<Warrior2> list = new ArrayList<>();

    private static Random rand = new Random();

    private static int random;

    private static int random() {
        return rand.nextInt(2);
    }

    private static Warrior2 whoHits(int index) {
        return list.get(index);
    }

    public static void main(String[] args) {
        Warrior2 warrior1 = new Warrior2(1, 100);
        Warrior2 warrior2 = new Warrior2(2, 100);
        list.add(warrior1);
        list.add(warrior2);
        boolean dead = false;
        Warrior2 whoHits;
        Warrior2 whoGotHit;
        while (!dead) {
            random = random();
            whoHits = whoHits(random);
            whoGotHit = list.get(1 - random);
            dead = whoHits.kick(whoGotHit);
        }
    }
}
