package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
    Car car = new Car();
    Plane plane = new Plane();
    Train train = new Train();
    Scanner s = new Scanner(System.in);
    int dur = s.nextInt();
    if(plane.duration<=dur){
        System.out.println("choose plane");
    }else if(car.duration<=dur){
        System.out.println("choose car");
    }else if(train.duration<=dur){
        System.out.println("choose train");
    }
//	Pyramid p = new Pyramid(10);
//	Box box = new Box();
//	box.add(p);
//
//	Cylyinder c = new Cylyinder(45);
//	box.add(c);
//
//        Pyramid pyr = new Pyramid(20);
//        box.add(pyr);
//
//        Cylyinder cyl = new Cylyinder(90);
//        box.add(cyl);
//
//        Pyramid pyra = new Pyramid(12,34);
//
//        box.add(pyra);
//
//        Cylyinder cyly = new Cylyinder(20,10);
//        box.add(cyly);
//
//        System.out.println(box.currentVolume);
    }
}
