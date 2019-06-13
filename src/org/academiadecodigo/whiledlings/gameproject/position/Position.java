package org.academiadecodigo.whiledlings.gameproject.position;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.whiledlings.gameproject.characters.CharactersEnum;

public class Position {


    /**
     * THIS CLASS IS RESPONSIBLE FOR POSITIONING THE IN GAME OBJECT GRAPHICALLY AND LOGICALLY
     *
     * &&
     *
     * THIS CLASS IS ALSO RESPONSIBLE FOR THE PIC'S CORRECT SIZE * SIZE DISPLAY
     *
     */


    private int columnX;
    private int rowY;
    private String image;
    private Picture graphicRepresentation;

    /**
     *
     */

    public Position(CharactersEnum charactersEnum){

        columnX = charactersEnum.getInicialWidth();
        rowY = charactersEnum.getInicialHeigth();
        image = charactersEnum.getImage();

        graphicRepresentation = new Picture(columnX, rowY, image);
        graphicRepresentation.draw();

    }

    /**
     *  SETTERS FOR SET COLUMN (X) PIXEL && SET ROW (Y) PIXEL
     */

    public void setColumnX(int columnX) {
        this.columnX = columnX;
    }

    public void setRowY(int rowY) {
        this.rowY = rowY;
    }

    /**
     *GETTERS FOR COLUMN (X) RELATIVE PIXEL POSITION && ROW (Y) RELATIVE PIXEL POSITION
     *
     */


    public int getColumnX() {
        return columnX;
    }


    public int getRowY() {
        return rowY;
    }

    public Picture getGraphicRepresentation() {
        return graphicRepresentation;
    }

    public void printColandRow() {
        System.out.println( "Column : " + getColumnX() + "and Row : " + getRowY());
    }

}