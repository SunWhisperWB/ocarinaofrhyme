package org.academiadecodigo.whiledlings.gameproject.characters.enemy;

public class FactoryEnemy {

    private int countBossEnemy;
    private RegularEnemy[] regularEnemy;
    private BossEnemy bossEnemy;

    //Create Regular Enemy
    public RegularEnemy [] createRegularEnemy(int maxEnemy){

        for(int i = 0; i < maxEnemy; i++){

            regularEnemy[i] = new RegularEnemy();
        }
        return regularEnemy;
    }

    //Create Mc's enemy once in choosed scenario
    public BossEnemy createBossEnemy(){

        BossEnemy bossEnemy = null;

        switch (countBossEnemy){
            case 0:
                bossEnemy = new BossEnemy("MC Mariana");
                break;
            case 1:
                bossEnemy = new BossEnemy("MC Seringas");
                break;
            case 2:
                bossEnemy = new BossEnemy("MC Faustino");
                break;
        }
        countBossEnemy++;
        return bossEnemy;
    }



}
