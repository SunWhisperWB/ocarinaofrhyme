package org.academiadecodigo.whiledlings.gameproject.keyboard;


import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.whiledlings.gameproject.Game;
import org.academiadecodigo.whiledlings.gameproject.position.Direction;


public class GameKeyBoardHandler implements KeyboardHandler {

    private Game game;

    public GameKeyBoardHandler(Game game) {
        this.game = game;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_LEFT:
                game.movePlayer(Direction.LEFT);
                break;
            case KeyboardEvent.KEY_RIGHT:
                game.movePlayer(Direction.RIGTH);
                break;
            case KeyboardEvent.KEY_UP:
               game.movePlayer(Direction.UP);
                break;
            case KeyboardEvent.KEY_DOWN:
                game.movePlayer(Direction.DOWN);
                break;

        }

    }




    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }


}
