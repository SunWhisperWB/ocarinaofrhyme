package org.academiadecodigo.whiledlings.gameproject.characters;

public enum CharactersEnum {

    PLAYER("./images/characteranimation/Walk (1).png" , 10, 10, 20),
    ENEMY("teste", 10, 10, 10);

    private String image;
    private int inicialWidth;
    private int inicialHeigth;
    private int velocity;


   CharactersEnum(String image, int inicialWidth, int inicialHeigth, int velocity){

       this.image = image;
       this.inicialWidth = inicialWidth;
       this.inicialHeigth = inicialHeigth;
       this.velocity = velocity;

   }

    public String getImage() {
        return image;
    }

    public int getInicialWidth() {
        return inicialWidth;
    }

    public int getInicialHeigth() {
        return inicialHeigth;
    }

    public int getVelocity() {
        return velocity;
    }
}
