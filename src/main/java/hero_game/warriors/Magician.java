package hero_game.warriors;

import hero_game.Hero;
import hero_game.interactions.MagicAttack;
import hero_game.interactions.PhysAttack;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    public Magician(double health, int physAttack, int magicAttack, double physDef, double magDef, int healHimself, int healTeammate) {
        super(100, 5, 20, 0, 0.8, 0, 0);
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth()
                - (getMagicAttack()
                - (getMagicAttack() * hero.getMagDef())));
        if (hero.getHealth() < 0) {
            hero.setHealth(0);
        }
        System.out.println(hero.getClass().getName() + " was magically attacked, health " + hero.getHealth());
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
