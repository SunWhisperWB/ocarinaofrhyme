package org.academiadecodigo.whiledlings.gameproject.position;

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
    private Picture graphicRepresentation;

    /**
     *
     * @param columnX Relative X Starting Pixel Position
     * @param rowY Relative Y Starting Pixel Position
     *
     *
     */


    public Position(int columnX, int rowY, Picture graphicRepresentation){

        this.columnX = columnX;
        this.rowY = rowY;
        this.graphicRepresentation = graphicRepresentation;
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

    public void printColandRow() {
        System.out.println( "Column : " + getColumnX() + "and Row : " + getRowY());
    }

}