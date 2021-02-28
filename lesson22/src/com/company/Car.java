package com.company;

public class Car extends Transport {
   float maxspeed = 25;
   @Override
    public void getTime(int d){
       System.out.println("Using car");
       System.out.println("Time = "+(d/maxspeed));

   }

}
