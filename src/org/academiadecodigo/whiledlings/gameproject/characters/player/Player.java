package org.academiadecodigo.whiledlings.gameproject.characters.player;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.whiledlings.gameproject.characters.AbstractCharacter;
import org.academiadecodigo.whiledlings.gameproject.characters.CharactersEnum;
import org.academiadecodigo.whiledlings.gameproject.scenarios.Scenario;


public class Player extends AbstractCharacter {


    public Player(Scenario scenario) {

        super(new Picture(10, 10, "./images/characteranimation/Walk (1).png"),
                10);

    }

}
