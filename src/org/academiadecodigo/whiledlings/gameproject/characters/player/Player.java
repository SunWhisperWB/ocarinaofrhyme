package org.academiadecodigo.whiledlings.gameproject.characters.player;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.whiledlings.gameproject.characters.AbstractCharacter;
import org.academiadecodigo.whiledlings.gameproject.characters.CharactersEnum;
import org.academiadecodigo.whiledlings.gameproject.keyboard.PlayerKeyBoardHandler;
import org.academiadecodigo.whiledlings.gameproject.position.Direction;
import org.academiadecodigo.whiledlings.gameproject.position.Position;

public class Player extends AbstractCharacter {


    private int velocity;
    private Keyboard keyboard;

    public Player() {

        position = new Position(CharactersEnum.PLAYER);

        velocity = CharactersEnum.PLAYER.getVelocity();

        new PlayerKeyBoardHandler(position.getGraphicRepresentation());



    }

    @Override
    public void move(Direction direction) {



    }
}
