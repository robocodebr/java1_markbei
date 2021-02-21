package com.company;

public class Box {
    public Shape shape;
    public int currentVolume;
    public int maxVolume = 100000;

    boolean add(Shape s){
     if(currentVolume>maxVolume){
         return false;
     }
        shape = s;
        currentVolume += s.volume;
     return true;
    }
}
