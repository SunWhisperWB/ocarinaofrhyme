package org.academiadecodigo.whiledlings.gameproject;

import org.academiadecodigo.whiledlings.gameproject.characters.enemy.Enemy;
import org.academiadecodigo.whiledlings.gameproject.characters.player.Player;
import org.academiadecodigo.whiledlings.gameproject.keyboard.GameKeyBoard;
import org.academiadecodigo.whiledlings.gameproject.position.Direction;
import org.academiadecodigo.whiledlings.gameproject.scenarios.Bedroom;
import org.academiadecodigo.whiledlings.gameproject.scenarios.LivingRoom;
import org.academiadecodigo.whiledlings.gameproject.scenarios.Scenario;

public class Game {

     private Enemy [] enemies;
     private Player player;
     private Scenario scenario;
     private DamageDetector damageDetector;

     public Game(){
          scenario = new LivingRoom();
          player = new Player(scenario);
          GameKeyBoard gameKeyBoard = new GameKeyBoard(this);
          gameKeyBoard.callKeyBoard(); //Call keyboard commands

     }

     //TODO: implementar método start in game
     public void start(){

     }


     public void movePlayer(Direction direction){
          player.move(direction, scenario.getCellSize());
     }


}
