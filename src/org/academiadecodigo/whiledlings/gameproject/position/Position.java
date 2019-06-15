package org.academiadecodigo.whiledlings.gameproject.position;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.whiledlings.gameproject.characters.CharactersEnum;

public class Position {

    private int col;
    private int row;

    public Position(int col, int row){
        this.col = col;
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setCol(int direction) {
        this.col += direction;
    }

    public void setRow(int direction) {
        this.row += direction;
    }
}