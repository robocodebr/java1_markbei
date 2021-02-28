package com.company;

public interface IAnimal {
   default void eat(){
       System.out.println("Animal eat ...");
   }
    void travel();
}
