package com.company;

public class Boss extends GameEntity {
    // из-за того у меня переменная weaponOfBoss
    private Weapon weaponOfBoss;


    public Weapon getWeaponOfBoss() {
        return weaponOfBoss;
    }

    public void setWeaponOfBoss(Weapon weaponOfBoss) {
        this.weaponOfBoss = weaponOfBoss;
    }

    public Boss(String weaponOfBoss, int hp, int damage) {
        super();
        this.setHp(hp);
        this.setDamage(damage);

    }

    public Weapon getWeapon() {
        return weaponOfBoss;
    }

    public Object getInfo() {
        return super.getInfo() + "weapon  " + this.weaponOfBoss;
    }
}

