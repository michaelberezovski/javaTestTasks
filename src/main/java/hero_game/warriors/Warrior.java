package hero_game.warriors;

import hero_game.Hero;
import hero_game.interactions.PhysAttack;

public class Warrior extends Hero implements PhysAttack {
    public Warrior(double health, int physAttack, int magicAttack, double physDef, double magDef, int healHimself, int healTeammate) {
        super(100, 30, 0, 0.8, 0, 0, 0);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth()
                - (getPhysAttack()
                - (getPhysAttack() * hero.getPhysDef())));
        if (hero.getHealth() < 0) {
            hero.setHealth(0);
        }
        System.out.println(hero.getClass().getName() + " was physically attacked, health " + hero.getHealth());
    }
}
