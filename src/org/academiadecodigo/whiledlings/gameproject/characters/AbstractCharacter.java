package org.academiadecodigo.whiledlings.gameproject.characters;

import org.academiadecodigo.whiledlings.gameproject.position.Direction;
import org.academiadecodigo.whiledlings.gameproject.position.Moveble;
import org.academiadecodigo.whiledlings.gameproject.position.Position;


public abstract class AbstractCharacter implements Moveble {

    private int velocity;
    private Position position;

    public AbstractCharacter(CharactersEnum characterType) {
        this.velocity = characterType.getVelocity();
        this.position = new Position(characterType);
    }


    @Override
    public void move(Direction direction) {

        switch (direction){

            case LEFT:
                position.getGraphicRepresentation().translate((-1) * velocity, 0);
                break;

            case RIGTH:
                position.getGraphicRepresentation().translate(velocity, 0 );
                break;

            case DOWN:
                position.getGraphicRepresentation().translate(0, velocity);
                break;

            case UP:
                position.getGraphicRepresentation().translate(0, (-1) * velocity);
                break;
        }


    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }


    public Position getPosition(){
        return position;
    }


}
