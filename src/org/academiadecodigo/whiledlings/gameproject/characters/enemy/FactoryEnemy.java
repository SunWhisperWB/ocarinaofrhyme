package org.academiadecodigo.whiledlings.gameproject.characters.enemy;

import org.academiadecodigo.whiledlings.gameproject.scenarios.ScenarioType;

public class FactoryEnemy {

    private int countBossEnemy;
    private RegularEnemy[] regularEnemy;
    private BossEnemy bossEnemy;
    private ScenarioType scenario;

    public FactoryEnemy(ScenarioType scenario){
        this.scenario = scenario;
    }

   /** Create Regular Enemy
    public RegularEnemy [] createRegularEnemy(int maxEnemy){

        for(int i = 0; i < maxEnemy; i++){

            regularEnemy[i] = new RegularEnemy(CharactersEnum.PLAYER);
        }
        return regularEnemy;
    }

    //Create Mc's enemy once in choosed scenario
   // public BossEnemy createBossEnemy(){

      //  return  new BossEnemy(scenario);
    // }

 **/

}
