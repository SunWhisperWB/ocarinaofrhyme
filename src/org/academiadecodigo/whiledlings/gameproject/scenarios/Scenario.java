package org.academiadecodigo.whiledlings.gameproject.scenarios;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class Scenario {

    private Picture scenario;
    private int cellSize;

    public Scenario(int x, int y, String path){

        scenario = new Picture(x, y, path);
        scenario.draw();
        cellSize = 5; //TODO: MUDAR ISTO
    }



    public int getX(){
        return getX();
    }

    public int getY(){
        return getY();
    }

    public int getCellSize(){
        return cellSize;
    }

}
