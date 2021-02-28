package com.company;

public class Cat implements IAnimal{
    @Override
    public void eat(){
        System.out.println("cat eat ...");
    }
    @Override
    public void travel(){
        System.out.println("cat travel ...");
    }
}
