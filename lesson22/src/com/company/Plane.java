package com.company;

public class Plane extends Transport{
    float maxspeed = 100;
    @Override
    public void getTime(int d){
        System.out.println("Using plane");
        System.out.println("Time = "+(d/maxspeed));

    }
}
