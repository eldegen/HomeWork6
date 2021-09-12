package com.company;

public class Main {

    public static void main(String[] args) {
        Boss b = new Boss(1000, 30, new Weapon("Shotgun", "Super Shotgun"));
        System.out.println("Boss health: " + b.getHealth() + " | Boss damage: " + b.getDamage() + " | Boss weapon name: " + b.getWeapon().getWeaponName()  + " | Boss weapon type: " + b.getWeapon().getWeaponType());

        // Доп дз

        System.out.println("==========================================================================");
        Boss b2 = new Boss(15000, 45, new Weapon("Sword", "Adamantite sword"));
        System.out.println(b2.printInfo());

        System.out.println("==========================================================================");
        Skeleton skeleton1 = new Skeleton(500, 10, new Weapon("Bow", "Worn bow"), 10);
        System.out.println(skeleton1.printInfo());

        Skeleton skeleton2 = new Skeleton(650, 20, new Weapon("Crossbow", "Enchanted crossbow"), 15);
        System.out.println(skeleton2.printInfo());
    }
}
