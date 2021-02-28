package com.company;

public class square extends figura {
    @Override
    public void info() {
        System.out.println("x = " + x + " y = " + y + " width = " + width + " height = " + height);
    }
    @Override
    public void display(){
        System.out.println("This is square");
        }
    }

