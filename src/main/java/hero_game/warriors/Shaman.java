package hero_game.warriors;

import hero_game.Hero;
import hero_game.interactions.Healer;
import hero_game.interactions.MagicAttack;
import hero_game.interactions.PhysAttack;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {

    public Shaman(double health, int physAttack, int magicAttack, double physDef, double magDef, int healHimself, int healTeammate) {
        super(100, 10, 15, 0.2, 0.2, 50, 30);
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + getHealHimself());
        if (getHealth() > 100) {
            setHealth(100);
        }
        System.out.println("Shaman healed himself " + getHealth());
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
        System.out.println(hero.getClass().getName() + " was magically attacked, health " + hero.getHealth());
    }
}
