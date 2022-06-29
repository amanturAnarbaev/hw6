package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss=new Boss("sword",500,70);
        System.out.println(boss.getInfo());
        Weapon weapon= new Weapon("Legendary","Escalibur");
    System.out.println(weapon.printingData());
    }
}