package org.academiadecodigo.whiledlings.gameproject;

import org.academiadecodigo.whiledlings.gameproject.characters.player.Player;
import org.academiadecodigo.whiledlings.gameproject.scenarios.Bedroom;

public class Main {
    public static void main(String[] args) {

        Bedroom bedroom = new Bedroom();
        bedroom.show();

        Player player = new Player();
    }
}
