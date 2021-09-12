package com.company;

public class Boss extends GameEntity{
    private Weapon weapon;

    public Boss(int health, int damage, Weapon weapon) {
        super(health, damage);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // Доп дз
    // Метод вывода статы на экран
    public String printInfo() {
        return "Boss health: " + getHealth() + " | Boss damage: " + getDamage() +
                " | Boss weapon name: " + getWeapon().getWeaponName()  + " | Boss weapon type: " + getWeapon().getWeaponType();
    }
}
