package org.academiadecodigo.whiledlings.gameproject;

import org.academiadecodigo.whiledlings.gameproject.characters.enemy.Enemy;
import org.academiadecodigo.whiledlings.gameproject.characters.player.Player;

public class DamageDetector {
    //TODO: mudar o valor da distância
    private final int MAX_DISTANCE_DAMAGE = 30; //Max distance to cause damage

    //TODO: implementar método
    public boolean check(Player player, Enemy enemy){

        int playerArea = (player.getPosition().getColumnX() + player.getMaxX()) * (player.getPosition().getRowY() + player.getMaxY());
        int enemyArea = (enemy.getPosition().getColumnX() + enemy.getMaxX()) * (enemy.getPosition().getRowY() + enemy.getMaxY());

        if(Math.abs(playerArea - enemyArea) <= MAX_DISTANCE_DAMAGE){
            return true;
        }
        return false;
    }

    //TODO: fazer este método
    public boolean amunitionCheck(){
        return false;
    }

}
