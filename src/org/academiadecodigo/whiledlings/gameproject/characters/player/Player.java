package org.academiadecodigo.whiledlings.gameproject.characters.player;

import org.academiadecodigo.whiledlings.gameproject.characters.AbstractCharacter;
import org.academiadecodigo.whiledlings.gameproject.characters.CharactersEnum;
import org.academiadecodigo.whiledlings.gameproject.keyboard.PlayerKeyBoardHandler;
import org.academiadecodigo.whiledlings.gameproject.position.Direction;


public class Player extends AbstractCharacter {

    public Player() {

        super(CharactersEnum.PLAYER);

        move(Direction.RIGTH);
    }

    @Override
    public void move(Direction direction) {

        new PlayerKeyBoardHandler(super.getPosition().getGraphicRepresentation());

    }
}
