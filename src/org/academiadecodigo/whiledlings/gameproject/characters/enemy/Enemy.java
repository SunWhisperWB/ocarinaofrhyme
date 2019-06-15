package org.academiadecodigo.whiledlings.gameproject.characters.enemy;

import org.academiadecodigo.whiledlings.gameproject.characters.AbstractCharacter;
import org.academiadecodigo.whiledlings.gameproject.characters.CharactersEnum;
import org.academiadecodigo.whiledlings.gameproject.position.Direction;

public abstract class Enemy extends AbstractCharacter {

    private AbstractCharacter thisEnemy;

    public Enemy(CharactersEnum charactersEnum) {

        super(CharactersEnum.REGULARENEMY);
    }

    //TODO: desenvolver este método
    @Override
    public void move(Direction direction) {
        int leftMost = 15;
        int rightMost = 50;
        int downMost = 50;
        int upperMost = 15;

        //Forcing a smaller array of bounds
        int directionRandomizer = (int)(Math.random()*4);
        if (this.getPosition().getCol() == leftMost){
            directionRandomizer = (int)(Math.random()*3);
        }
        if (this.getPosition().getCol() == rightMost){
            directionRandomizer = (int)(Math.random()*3);
            if (directionRandomizer == 2){
                directionRandomizer = 3;
            }
        }
        if (this.getPosition().getRow() == upperMost){
            directionRandomizer = (int)(Math.random()*3)+1;
        }
        if (this.getPosition().getCol() == downMost){
            directionRandomizer = (int)(Math.random()*3);
            if (directionRandomizer == 1){
                directionRandomizer = 3;
            }
        }

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


        super.move(direction);
    }
}
