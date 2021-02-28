package com.company;

public class Superman implements  canRun,canFly,canSwim  {
    @Override
    public void fly(){
      System.out.println("Fly");
    }
    public void swim(){
      System.out.println("Swim");
    }
    public void run(){
      System.out.println("Run");
    }

}
