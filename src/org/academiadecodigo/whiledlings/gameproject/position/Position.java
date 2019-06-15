package org.academiadecodigo.whiledlings.gameproject.position;


public class Position {

    private int col;
    private int row;


    /**
     *
     * @param col Logical Column position value
     * @param row Logical row position value
     */

    public Position(int col, int row){
        this.col = col;
        this.row = row;
    }

    /**
     * GETTERS
     * @return of the Column and Row values at any given time
     */

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }


    /** SETTERS
     * for characters moving logical position proposes **/

    public void setCol(int velocity) {
        this.col += velocity;
    }

    public void setRow(int velocity) {
        this.row += velocity;
    }
}