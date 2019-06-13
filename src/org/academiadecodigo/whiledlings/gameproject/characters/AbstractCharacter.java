package org.academiadecodigo.whiledlings.gameproject.characters;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.whiledlings.gameproject.gameobjects.Weapon.Gun;
import org.academiadecodigo.whiledlings.gameproject.gameobjects.Weapon.Weapon;
import org.academiadecodigo.whiledlings.gameproject.position.Direction;
import org.academiadecodigo.whiledlings.gameproject.position.Moveble;
import org.academiadecodigo.whiledlings.gameproject.position.Position;

public abstract class AbstractCharacter implements Moveble {


    private Position position;
    private Picture graphicRepresentation;
    private int movementSpeed;
    private Picture image;
    private Weapon weapon;

    public AbstractCharacter(int columnX, int rowY, int movementSpeed, String path){
        image = new Picture(columnX, rowY, path);
        this.movementSpeed = movementSpeed;
        position = new Position(columnX, rowY, graphicRepresentation);
        weapon = new Gun();

    }

    
    @Override
    public void move(Direction direction, int velocity) {

    }

    public Position getPosition(){
        return position;
    }
    //Returns the image width
    public int getMaxX(){
        return image.getMaxX();
    }
    //Returns the image height
    public int getMaxY(){
        return image.getMaxY();
    }
}
