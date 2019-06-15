package org.academiadecodigo.whiledlings.gameproject.gameobjects.Weapon;

import org.academiadecodigo.whiledlings.gameproject.gameobjects.Weapon.amunition.Amunition;
import org.academiadecodigo.whiledlings.gameproject.gameobjects.Weapon.amunition.AmunitionType;

public class AmunitionWeapon extends Weapon{

    private AmunitionType amunition;

    public AmunitionWeapon(AmunitionType amunition){
        this.amunition = amunition;
    }
}
