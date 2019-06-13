package org.academiadecodigo.whiledlings.gameproject.gameobjects.Weapon.amunition;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class Amunition {

    private AmunitionType type;

    public Amunition(int x, int y, String path, AmunitionType type){
        this.type = type;
        Picture image = new Picture(x, y, path);
    }
}
