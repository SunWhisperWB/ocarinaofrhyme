package org.academiadecodigo.whiledlings.gameproject.characters;

import org.academiadecodigo.whiledlings.gameproject.position.Direction;
import org.academiadecodigo.whiledlings.gameproject.position.Moveble;
import org.academiadecodigo.whiledlings.gameproject.position.Position;


public abstract class AbstractCharacter implements Moveble {

    protected Position position;

    public AbstractCharacter() {

    }


    @Override
    public void move(Direction direction) {

    }

}
