package org.academiadecodigo.whiledlings.gameproject.gameobjects.Weapon;

public enum AmunitionType {
    //TODO: Mudar a velocidade
    BULLET(10),
    ARROW(5);

    private int speed;

    AmunitionType(int speed){
        this.speed = speed;
    }
}
