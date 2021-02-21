package com.company;

public class Pyramid extends Shape {
    Pyramid(int vol){
        super(vol);

    }
    Pyramid(int So,int h) {
        super((int)(So * h * 0.33));
    }
}
