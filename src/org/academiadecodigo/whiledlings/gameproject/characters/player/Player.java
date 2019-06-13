package org.academiadecodigo.whiledlings.gameproject.characters.player;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.whiledlings.gameproject.characters.AbstractCharacter;
import org.academiadecodigo.whiledlings.gameproject.characters.CharactersEnum;
import org.academiadecodigo.whiledlings.gameproject.keyboard.PlayerKeyBoardHandler;
import org.academiadecodigo.whiledlings.gameproject.position.Direction;
import org.academiadecodigo.whiledlings.gameproject.position.Position;

public class Player extends AbstractCharacter {



    private Keyboard keyboard;

    public Player() {

        super();
        position = new Position(CharactersEnum.PLAYER);

        super.setVelocity(CharactersEnum.PLAYER.getVelocity());

        move(Direction.RIGTH);

    }

    @Override
    public void move(Direction direction) {

        new PlayerKeyBoardHandler(position.getGraphicRepresentation());

    }
}
