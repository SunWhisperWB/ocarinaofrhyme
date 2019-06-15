package org.academiadecodigo.whiledlings.gameproject.gameobjects.Weapon.amunition;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.whiledlings.gameproject.position.Direction;
import org.academiadecodigo.whiledlings.gameproject.position.Moveble;
import org.academiadecodigo.whiledlings.gameproject.position.Position;
import org.academiadecodigo.whiledlings.gameproject.scenarios.Scenario;

public class Amunition implements Moveble {

    private AmunitionType amunitionType;

    private Rectangle rectangle;

    private Position position;
    private int velocity;

    public Amunition(Position position, Direction direction, AmunitionType amunitionType){

        this.amunitionType = amunitionType;

        velocity = amunitionType.getSpeed();

        this.position = new Position(position.getCol(), position.getRow());

        int inicialCol = position.getCol();
        int inicialRow = position.getRow();

        rectangle = new Rectangle(inicialCol, inicialRow, 3, 3);



    }

    @Override
    public void move(Direction direction) {

            int speed = Scenario.CELL_SIZE * velocity;

            switch (direction){
                case RIGTH:
                    rectangle.translate(speed , 0);
                    position.setCol(velocity);
                    break;

                case LEFT:

                    rectangle.translate(-speed, 0);
                    position.setCol(-velocity);


                    break;

                case UP:

                    rectangle.translate(0, -speed);
                    position.setRow(-velocity);


                    break;

                case DOWN:

                    rectangle.translate(0, speed);
                    position.setRow(velocity);

                    break;
            }

        }
}

