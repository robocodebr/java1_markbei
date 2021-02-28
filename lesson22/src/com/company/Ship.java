package com.company;

public class Ship extends Transport {
    float maxspeed = 50;
    @Override
    public void getTime(int d){
        System.out.println("Using ship");
        System.out.println("Time = "+(d/maxspeed));

    }
}
