package org.academiadecodigo.whiledlings.gameproject.keyboard;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.whiledlings.gameproject.Game;

public class GameKeyBoard {

    private Game game;

    public GameKeyBoard(Game game){
        this.game = game;
    }

    public void callKeyBoard(){

        playerKeyBoard(KeyType.RIGHT);
        playerKeyBoard(KeyType.LEFT);
        playerKeyBoard(KeyType.UP);
        playerKeyBoard(KeyType.DOWN);
    }

    private void playerKeyBoard(KeyType keyType){

        KeyboardHandler kb = new GameKeyBoardHandler(game);
        Keyboard keyboard = new Keyboard(kb);
        KeyboardEvent event = new KeyboardEvent();

        switch (keyType){
            case RIGHT:
                event.setKey(KeyboardEvent.KEY_RIGHT);
                break;
            case LEFT:
                event.setKey(KeyboardEvent.KEY_LEFT);
                break;
            case UP:
                event.setKey(KeyboardEvent.KEY_UP);
                break;
            case DOWN:
                event.setKey(KeyboardEvent.KEY_DOWN);
                break;


        }
        event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(event);

    }
    //Keyboard shortcuts
    public enum KeyType {
        RIGHT,
        LEFT,
        UP,
        DOWN,
        SPACE
    }
}
