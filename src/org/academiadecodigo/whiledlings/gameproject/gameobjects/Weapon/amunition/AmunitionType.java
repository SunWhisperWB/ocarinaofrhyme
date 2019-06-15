package org.academiadecodigo.whiledlings.gameproject.gameobjects.Weapon.amunition;

public enum AmunitionType {

    //TODO: Mudar os dados
    BULLET( 10),
    ARROW(5);

    private int speed;


    AmunitionType(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
