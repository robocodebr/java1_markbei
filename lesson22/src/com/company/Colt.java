package com.company;

public class Colt extends Weapon {
    String name = "Colt";
    int range = 100;
    int weight = 250;
    int ammo  = 10;
    @Override
    public void Shot(){
        System.out.println("Pew-pew");
    }
}
