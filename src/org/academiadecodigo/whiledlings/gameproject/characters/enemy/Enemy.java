package org.academiadecodigo.whiledlings.gameproject.characters.enemy;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.whiledlings.gameproject.characters.AbstractCharacter;
import org.academiadecodigo.whiledlings.gameproject.characters.CharactersEnum;
import org.academiadecodigo.whiledlings.gameproject.position.Direction;
import org.academiadecodigo.whiledlings.gameproject.scenarios.Scenario;

public abstract class Enemy extends AbstractCharacter {

    public Enemy(CharactersEnum charactersEnum) {

        super(CharactersEnum.PLAYER);
    }

    //TODO: desenvolver este método
    @Override
    public void move(Direction direction, int cellSize) {
        super.move(direction, cellSize);
    }
}
