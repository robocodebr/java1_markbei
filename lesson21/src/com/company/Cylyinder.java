package com.company;

public class Cylyinder extends Shape{
    Cylyinder(int volum) {
        super(volum);
    }
    Cylyinder(int r, int h){
        super((int)(r*r*h*Math.PI));
    }
}
