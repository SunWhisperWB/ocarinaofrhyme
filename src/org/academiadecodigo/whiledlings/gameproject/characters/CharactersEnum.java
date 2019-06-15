package org.academiadecodigo.whiledlings.gameproject.characters;

public enum CharactersEnum {

    PLAYER( 0, 0, "./images/characteranimation/Walk (1).png", 3),
    REGULARENEMY( 30,30, "./images/enemy/enemy.png", 3);




    private int inicialCol;
    private int inicialRow;
    private String inicialImage;
    private int velocity;

   CharactersEnum(int inicialCol, int inicialRow, String inicialImage, int velocity){


       this.inicialCol = inicialCol;
       this.inicialRow = inicialRow;
       this.inicialImage = inicialImage;
       this.velocity = velocity;

   }

    public int getInicialCol() {
        return inicialCol;
    }

    public int getInicialRow() {
        return inicialRow;
    }

    public String getInicialImage() {
        return inicialImage;
    }

    public int getVelocity() {
        return velocity;
    }
}
