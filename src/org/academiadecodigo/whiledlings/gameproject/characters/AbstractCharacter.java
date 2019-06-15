package org.academiadecodigo.whiledlings.gameproject.characters;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.whiledlings.gameproject.position.Direction;
import org.academiadecodigo.whiledlings.gameproject.position.Moveble;
import org.academiadecodigo.whiledlings.gameproject.position.Position;


public abstract class AbstractCharacter implements Moveble {

    Picture picture;
    private int velocity;
    private Position position;

    public AbstractCharacter(CharactersEnum charactersEnum) {


        picture = new Picture(charactersEnum.getInicialCol(),
                charactersEnum.getInicialRow(), charactersEnum.getInicialImage());
       picture.draw();
       this.velocity = charactersEnum.getVelocity();

       this.position = new Position(charactersEnum.getInicialCol(), charactersEnum.getInicialRow());
    }


    @Override
    public void move(Direction direction, int cellSize) {

        int speed = cellSize * velocity;

        switch (direction){
            case RIGTH:
                picture.translate(speed , 0);
                position.setCol(velocity);
                System.out.println(" I'm in column: " + position.getCol() + " and " + " I'm on row " + position.getRow());
                break;
            case LEFT:
                picture.translate(-speed, 0);
                position.setCol(-velocity);
                System.out.println(" I'm in column: " + position.getCol() + " and " + " I'm on row " + position.getRow());
                break;
            case UP:
                picture.translate(0, -speed);
                position.setRow(-velocity);
                System.out.println(" I'm in column: " + position.getCol() + " and " + " I'm on row " + position.getRow());
                break;
            case DOWN:
                picture.translate(0, speed);
                position.setRow(velocity);
                System.out.println(" I'm in column: " + position.getCol() + " and " + " I'm on row " + position.getRow());
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
