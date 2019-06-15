package org.academiadecodigo.whiledlings.gameproject.characters.enemy;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.whiledlings.gameproject.characters.CharactersEnum;
import org.academiadecodigo.whiledlings.gameproject.scenarios.Scenario;

public class RegularEnemy extends Enemy{

    public RegularEnemy(Scenario scenario){
        super(new Picture(scenario.getX(), scenario.getY(),""),
                scenario,
                CharactersEnum.PLAYER.ordinal());
    }
}
