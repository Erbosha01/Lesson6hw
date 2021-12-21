package com.company;

public class Boss extends GameEntity{
    Weapon weapon = new Weapon();
    private Weapon boss_weapon;
    public Weapon getBoss_weapon() {
        return boss_weapon;
    }

    public void setBoss_weapon(Weapon boss_weapon) {
        this.boss_weapon = boss_weapon;
    }
    public String printInfo() {
        return "Health: " + getHealth() + "\nDamage: " + getDamage() + "\nName:" + weapon.getName() + "\nType:" + weapon.getType();
    }
}
