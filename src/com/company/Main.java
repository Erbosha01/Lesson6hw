package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.weapon.setType("Gun");
        boss.weapon.setName("Deagle");
        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.weapon.getName() + " " + boss.weapon.getType() );

        System.out.println("-------------------------------");
        
        System.out.println(boss.printInfo());

        System.out.println("-------------------------------");

        Skeleton s1 = new Skeleton();
        s1.setHealth(200);
        s1.setDamage(20);
        s1.setNumberOfArrows(12);
        s1.weapon.setName("lskdj");
        s1.weapon.setType("lsdkj");
        System.out.println(s1.printInfo());

        System.out.println("-------------------------------");

        Skeleton s2 = new Skeleton();
        s2.setHealth(150);
        s2.setDamage(15);
        s2.setNumberOfArrows(15);
        s1.weapon.setName("lskdhdhjj");
        s1.weapon.setType("lhjsdgfdhsdkj");
        System.out.println(s2.printInfo());
    }
}
