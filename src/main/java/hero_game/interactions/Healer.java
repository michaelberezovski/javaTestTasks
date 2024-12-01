package hero_game.interactions;

import hero_game.Hero;

public interface Healer {

    void healHimself();

    void healTeammate(Hero hero);
}
