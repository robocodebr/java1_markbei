package com.company;

public class Akr extends Weapon {
    String name = "Akr";
    int range = 200;
    int weight = 500;
    int ammo = 30;
    @Override
    public void Shot(){
        System.out.println("Poof");
    }
}
