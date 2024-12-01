package hero_game.warriors;

import hero_game.Hero;
import hero_game.interactions.Healer;
import hero_game.interactions.PhysAttack;

public class Paladin extends Hero implements PhysAttack, Healer {

    public Paladin(double health, int physAttack, int magicAttack, double physDef, double magDef, int healHimself, int healTeammate) {
        super(100, 15, 0, 0.5, 0.2, 25, 10);
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + getHealHimself());
        if (getHealth() > 100) {
            setHealth(100);
        }
        System.out.println("Paladin healed himself " + getHealth());
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + getHealTeammate());
        if(hero.getHealth() > 100) {
            hero.setHealth(100);
        }
        System.out.println(hero.getClass().getName() + " was healed, health " + hero.getHealth());
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
