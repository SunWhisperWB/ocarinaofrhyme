package org.academiadecodigo.whiledlings.gameproject.characters;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.whiledlings.gameproject.gameobjects.Weapon.Gun;
import org.academiadecodigo.whiledlings.gameproject.gameobjects.Weapon.Weapon;
import org.academiadecodigo.whiledlings.gameproject.position.Direction;
import org.academiadecodigo.whiledlings.gameproject.position.Moveble;
import org.academiadecodigo.whiledlings.gameproject.position.Position;
import org.academiadecodigo.whiledlings.gameproject.scenarios.Scenario;


public abstract class AbstractCharacter implements Moveble {

    Picture picture;
    private int velocity;
    private Position position;
    private Direction shootingDirection;
    private Weapon weapon;

    public AbstractCharacter(CharactersEnum charactersEnum) {


        picture = new Picture(charactersEnum.getInicialCol(),
                charactersEnum.getInicialRow(), charactersEnum.getInicialImage());
       picture.draw();
       this.velocity = charactersEnum.getVelocity();

       this.position = new Position(charactersEnum.getInicialCol(), charactersEnum.getInicialRow());

       shootingDirection = Direction.RIGTH;
       weapon = new Gun();
    }


    @Override
    public void move(Direction direction) {
        int speed = Scenario.CELL_SIZE * velocity;

        switch (direction){
            case RIGTH:
                picture.translate(speed , 0);
                position.setCol(velocity);
                shootingDirection = Direction.RIGTH;


                System.out.println(" I'm in column: " + position.getCol() + " and " + " I'm on row " + position.getRow());

                break;
            case LEFT:

                picture.translate(-speed, 0);
                position.setCol(-velocity);
                shootingDirection = Direction.LEFT;

                System.out.println(" I'm in column: " + position.getCol() + " and " + " I'm on row " + position.getRow());
                break;

            case UP:

                picture.translate(0, -speed);
                position.setRow(-velocity);
                shootingDirection = Direction.UP;

                System.out.println(" I'm in column: " + position.getCol() + " and " + " I'm on row " + position.getRow());
                break;

            case DOWN:

                picture.translate(0, speed);
                position.setRow(velocity);
                shootingDirection = Direction.DOWN;

                System.out.println(" I'm in column: " + position.getCol() + " and " + " I'm on row " + position.getRow());
                break;
        }

    }

    public void playerShoot(){

        weapon.shot(position, getShootingDirection());
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

    public Direction getShootingDirection(){

        return shootingDirection;
    }


}
