package hero_game;

import java.util.Objects;

public abstract class Hero {
    private double health;
    private final int physAttack;
    private final int magicAttack;
    private final double physDef;
    private final double magDef;
    private final int healHimself;
    private final int healTeammate;

    public Hero(double health, int physAttack, int magicAttack, double physDef, double magDef, int healHimself, int healTeammate) {
        this.health = health;
        this.physAttack = physAttack;
        this.magicAttack = magicAttack;
        this.physDef = physDef;
        this.magDef = magDef;
        this.healHimself = healHimself;
        this.healTeammate = healTeammate;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getPhysAttack() {
        return physAttack;
    }

    public int getMagicAttack() {
        return magicAttack;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagDef() {
        return magDef;
    }

    public int getHealHimself() {
        return healHimself;
    }

    public int getHealTeammate() {
        return healTeammate;
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "health=" + health;
    }
}
