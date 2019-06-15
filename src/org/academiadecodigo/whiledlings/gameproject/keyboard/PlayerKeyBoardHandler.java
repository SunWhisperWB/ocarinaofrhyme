package org.academiadecodigo.whiledlings.gameproject.keyboard;


import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class PlayerKeyBoardHandler implements KeyboardHandler {


    private Keyboard keyboard;
    private Picture player;



    public PlayerKeyBoardHandler(Picture player){

        keyboard = new Keyboard(this);
        this.player = player;
        init();
    }

    public void init() {



        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);


        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);


            keyboard.addEventListener(left);
            keyboard.addEventListener(right);
            keyboard.addEventListener(up);
            keyboard.addEventListener(down);

        }


        @Override
        public void keyPressed(KeyboardEvent keyboardEvent) {

            switch (keyboardEvent.getKey()) {
                case KeyboardEvent.KEY_LEFT:
                    player.translate((-1) * 10, 0);

                    System.out.println();
                    break;
                case KeyboardEvent.KEY_RIGHT:
                    player.translate(10, 0);
                    break;
                case KeyboardEvent.KEY_UP:
                    player.translate(0, (-1) * 10);
                    break;
                case KeyboardEvent.KEY_DOWN:
                    player.translate(0, 10);
                    break;

            }

        }




        @Override
        public void keyReleased(KeyboardEvent keyboardEvent) {

        }
    }
