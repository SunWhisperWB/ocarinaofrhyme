package org.academiadecodigo.whiledlings.gameproject.gameobjects.Weapon.amunition;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public enum AmunitionType {
    //TODO: Mudar os dados
    BULLET(0, 0, "", 10),
    ARROW(0, 0, "", 5);

    private int speed;

    AmunitionType(int x, int y, String path, int speed){
        this.speed = speed;
        Picture image = new Picture(x, y, path);
    }
}
