package com.company;

public abstract class figura {
   public int y;
   public int x;
   public int width;
   public int height;

   public void info(){
       System.out.println("x = " + x + " y = " + y);
   }
   public abstract void display();
}
