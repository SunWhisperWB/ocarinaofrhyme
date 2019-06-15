package org.academiadecodigo.whiledlings.gameproject.characters;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.whiledlings.gameproject.position.Direction;
import org.academiadecodigo.whiledlings.gameproject.position.Moveble;
import org.academiadecodigo.whiledlings.gameproject.position.Position;


public abstract class AbstractCharacter implements Moveble {

    Picture picture;
    private int velocity;
    private Position position;

    public AbstractCharacter(Picture picture, int velocity) {
       this.picture = picture;
       picture.draw();
       this.velocity = velocity;
       this.position = new Position(0, 0); //TODO: MUDAR
    }


    @Override
    public void move(Direction direction, int cellSize) {

        int speed = cellSize * velocity;

        switch (direction){
            case RIGTH:
                picture.translate(speed , 0);
                position.setCol(velocity);
                break;
            case LEFT:
                picture.translate(-speed, 0);
                position.setCol(-velocity);
                break;
            case UP:
                picture.translate(0, -speed);
                position.setRow(-velocity);
                break;
            case DOWN:
                picture.translate(0, speed);
                position.setRow(velocity);
                break;
        }

    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }


    public Position getPosition(){
        return position;
    }

    public void setPosition(Position position){
        this.position = position;
    }


}
