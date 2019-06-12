package org.academiadecodigo.whiledlings.gameproject.characters;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.whiledlings.gameproject.position.Direction;
import org.academiadecodigo.whiledlings.gameproject.position.Moveble;
import org.academiadecodigo.whiledlings.gameproject.position.Position;

public abstract class AbstractCharacter implements Moveble {


    private Position position;
    private Picture graphicRepresentation;
    private int movementSpeed;

    public AbstractCharacter(int columnX, int rowY, int movementSpeed){

        this.movementSpeed = movementSpeed;
        position = new Position(columnX, rowY, graphicRepresentation);
    }

    
    @Override
    public void move(Direction direction, int velocity) {

    }
}
