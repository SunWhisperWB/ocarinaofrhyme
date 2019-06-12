package org.academiadecodigo.whiledlings.gameproject.characters.enemy;

public class FactoryEnemy {

    private int countBossEnemy;

    public RegularEnemy [] createRegularEnemy(int maxEnemy){

        RegularEnemy[] enemy = null;

        for(int i = 0; i < maxEnemy; i++){

            enemy[i] = new RegularEnemy();
        }

        return enemy;
    }

    public BossEnemy createBossEnemy(){

        BossEnemy enemy = null;

        switch (countBossEnemy){
            case 0:
                enemy = new BossEnemy("MC Mariana");
                break;
            case 1:
                enemy = new BossEnemy("MC Seringas");
                break;
            case 2:
                enemy = new BossEnemy("MC Faustino");
                break;
        }
        countBossEnemy++;
        return enemy;
    }

}
