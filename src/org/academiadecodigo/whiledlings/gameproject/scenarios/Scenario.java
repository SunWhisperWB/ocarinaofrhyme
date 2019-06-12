package org.academiadecodigo.whiledlings.gameproject.scenarios;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class Scenario {

    private Picture scenario;
    private static int x;
    private static int y;
    private static int maxX;
    private static int maxY;

    public Scenario(int x, int y, String image){

        scenario = new Picture(x, y, image);

        this.x = scenario.getX();
        this.y = scenario.getY();
        maxX = scenario.getMaxX();
        maxY = scenario.getMaxY();
    }

    public static int getX(){
        return x;
    }

    public static int getY(){
        return y;
    }

    public static int getMaxX(){
        return maxX;
    }

    public static int getMaxY(){
        return maxY;
    }

    public Picture getScenario(){
        return scenario;
    }

    public void show(){
        scenario.draw();
    }

    public void hide() {
        scenario.delete();
    }
}
