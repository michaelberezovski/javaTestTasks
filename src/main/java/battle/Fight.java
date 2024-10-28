package battle;

import java.util.ArrayList;
import java.util.Random;

public class Fight {

    private static void hit(Warrior warrior1, Warrior warrior2) {
        warrior1.setHealth(warrior1.getHealth() - 20);
        System.out.println("Warrior " + warrior2.getName() + " attacked");
        System.out.println("Remaining warrior " + warrior1.getName() + " health is: " + warrior1.getHealth());
    }

    private static int whoHits() {
        Random random = new Random();
        return random.nextInt(2);
    }

    private static int whoGotHit(int whoHits) {
        return whoHits == 0 ? 1 : 0;
    }

    private static boolean isDead(Warrior warrior1, Warrior warrior2) {
        if (warrior1.getHealth() <= 0) {
            System.out.println("Warrior " + warrior1.getName() + " is dead");
            System.out.println("Warrior " + warrior2.getName() + " has won");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Warrior warrior1 = new Warrior(1, 100);
        Warrior warrior2 = new Warrior(2, 100);
        ArrayList<Warrior> list = new ArrayList<>();
        list.add(warrior1);
        list.add(warrior2);
        boolean dead = false;
        int whoHits;
        int whoGotHit;
        while (!dead) {
            whoHits = whoHits();
            whoGotHit = whoGotHit(whoHits);
            hit(list.get(whoGotHit), list.get(whoHits));
            dead = isDead(list.get(whoGotHit), list.get(whoHits));
        }
    }
}
