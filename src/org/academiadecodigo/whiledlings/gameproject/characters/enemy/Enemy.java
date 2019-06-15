package org.academiadecodigo.whiledlings.gameproject.characters.enemy;

import org.academiadecodigo.whiledlings.gameproject.characters.AbstractCharacter;
import org.academiadecodigo.whiledlings.gameproject.characters.CharactersEnum;
import org.academiadecodigo.whiledlings.gameproject.position.Direction;

public abstract class Enemy extends AbstractCharacter {

    public Enemy(CharactersEnum charactersEnum) {

        super(CharactersEnum.REGULARENEMY);
    }

    //TODO: desenvolver este método
    @Override
    public void move(Direction direction, int cellSize) {
        int directionRandomizer = (int)(Math.random()*4);
        switch ( directionRandomizer){
            case (0):

                break;
            case (1):

                break;
            case (2):

                break;
            case (3):

                break;

        }


        super.move(direction, cellSize);
    }
}
