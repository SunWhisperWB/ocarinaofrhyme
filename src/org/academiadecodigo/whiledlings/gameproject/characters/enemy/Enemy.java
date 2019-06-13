package org.academiadecodigo.whiledlings.gameproject.characters.enemy;

import org.academiadecodigo.whiledlings.gameproject.characters.AbstractCharacter;

public abstract class Enemy extends AbstractCharacter {

    public Enemy(int columnX, int rowY, int movementSpeed, String path) {
        super(columnX, rowY, movementSpeed, path);
    }
}
