package org.academiadecodigo.whiledlings.gameproject.characters.enemy;

import org.academiadecodigo.whiledlings.gameproject.characters.AbstractCharacter;
import org.academiadecodigo.whiledlings.gameproject.characters.CharactersEnum;
import org.academiadecodigo.whiledlings.gameproject.position.Direction;

public abstract class Enemy extends AbstractCharacter {

    public Enemy(CharactersEnum characterType) {
        super(characterType);
    }

    //TODO: desenvolver este método
    @Override
    public void move(Direction direction) {
        super.move(direction);
    }
}
