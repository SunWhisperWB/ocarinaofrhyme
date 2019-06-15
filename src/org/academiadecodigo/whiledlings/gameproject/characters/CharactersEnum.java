package org.academiadecodigo.whiledlings.gameproject.characters;

public enum CharactersEnum {


    /**
     * CHARACTERS ENUM MENTIONS ALL THE @PARAM THAT ARE CHARACTERISTICS OF THE INDIVIDUAL CHARACTER CLASS
     */

    PLAYER("./images/characteranimation/Walk (1).png" , 10, 10, 50),
    ENEMY("teste", 10, 10, 10);

    private String image;
    private int inicialWidthX;
    private int inicialHeigthY;
    private int velocity;

    /**
     *
     * @param image It's a string that saves the image path to the first picture
     * @param inicialWidthX It's the X Pixel value of the 1º Position for the character!
     * @param inicialHeigthY It's the X Pixel value of the 1º Position for the character!
     * @param velocity It's the inicial velocity of a character
     */


   CharactersEnum(String image, int inicialWidthX, int inicialHeigthY, int velocity){

       this.image = image;
       this.inicialWidthX = inicialWidthX;
       this.inicialHeigthY = inicialHeigthY;
       this.velocity = velocity;

   }

    /**
     * GETTERS && Setters
     **/

    public String getImage() {
        return image;
    }

    public int getInicialWidthX() {
        return inicialWidthX;
    }

    public int getInicialHeigthY() {return inicialHeigthY;
    }

    public int getVelocity() {
        return velocity;
    }
}
