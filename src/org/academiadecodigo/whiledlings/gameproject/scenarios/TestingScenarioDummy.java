package org.academiadecodigo.whiledlings.gameproject.scenarios;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;



public class TestingScenarioDummy {

    public static final int PADDING = 10;
    private static final int CELL_SIZE_IN_PIXELS = 20;
    private int cols;
    private int rows;

    public TestingScenarioDummy(int cols, int rows){
        this.cols = cols;
        this.rows = rows;
        init();
    }

    public void init(){
        Rectangle rectangle = new Rectangle(PADDING,PADDING,cols*CELL_SIZE_IN_PIXELS,rows*CELL_SIZE_IN_PIXELS);
        rectangle.setColor(Color.BLACK);
        rectangle.draw();
    }

    public static TestingScenarioDummy makeScenario(int cols, int rows){

        return new TestingScenarioDummy(cols, rows) {
        };
    }

    public int getCols(){
        return cols;
    }

    public int getRows(){
        return rows;
    }

    public int getWidth(){
        return cols * CELL_SIZE_IN_PIXELS;
    }

    public int getHeigth(){
        return rows* CELL_SIZE_IN_PIXELS;
    }

    public int getCellSizeInPixels() {
        return CELL_SIZE_IN_PIXELS;
    }
}