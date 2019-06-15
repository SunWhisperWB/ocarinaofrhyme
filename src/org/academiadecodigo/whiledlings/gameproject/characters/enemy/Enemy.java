package org.academiadecodigo.whiledlings.gameproject.characters.enemy;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.whiledlings.gameproject.characters.AbstractCharacter;
import org.academiadecodigo.whiledlings.gameproject.characters.CharactersEnum;
import org.academiadecodigo.whiledlings.gameproject.position.Direction;
import org.academiadecodigo.whiledlings.gameproject.scenarios.Scenario;

public abstract class Enemy extends AbstractCharacter {

    public Enemy(Picture picture, Scenario scenario, int velocity) {
        super(picture, velocity);
    }

    //TODO: desenvolver este método
    @Override
    public void move(Direction direction, int cellSize) {
        super.move(direction, cellSize);
    }
}
