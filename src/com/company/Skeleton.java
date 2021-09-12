package com.company;

public class Skeleton extends Boss{
    private int arrows;

    public Skeleton(int health, int damage, Weapon weapon, int arrows) {
        super(health, damage, weapon);
        this.arrows = arrows;
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    // Доп дз
    // Метод статы скелета
    public String printInfo() {
        return super.printInfo() + " | Arrows: " + getArrows();
    }
}
