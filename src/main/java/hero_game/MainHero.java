package hero_game;

import hero_game.warriors.Magician;
import hero_game.warriors.Paladin;
import hero_game.warriors.Shaman;
import hero_game.warriors.Warrior;

public class MainHero {
    public static void main(String[] args) {
        Warrior warrior = new Warrior(100, 30, 0, 0.8, 0, 0, 0);
        Paladin paladin = new Paladin(100, 15, 0, 0.5, 0.2, 25, 10);
        Magician magician = new Magician(100, 5, 20, 0, 0.8, 0, 0);
        Shaman shaman = new Shaman(100, 10, 15, 0.2, 0.2, 50, 30);

        warrior.physicalAttack(paladin);
        paladin.physicalAttack(magician);
        shaman.healTeammate(magician);
        magician.magicalAttack(paladin);
        shaman.physicalAttack(warrior);
        paladin.healHimself();
        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(magician);
        }
    }
}
