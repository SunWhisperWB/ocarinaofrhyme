package org.academiadecodigo.whiledlings.gameproject.gameobjects.Weapon;

import org.academiadecodigo.whiledlings.gameproject.gameobjects.Weapon.amunition.Amunition;
import org.academiadecodigo.whiledlings.gameproject.position.Direction;
import org.academiadecodigo.whiledlings.gameproject.position.Position;

public abstract class Weapon {

    private int damage;
    private Amunition amunition;
    private Direction shootingDirection;


    //TODO: fazer o método
    public void shot(Position position, Direction shootingDirection){

        amunition = new Amunition(position);

        this.shootingDirection = shootingDirection;

    }
}
