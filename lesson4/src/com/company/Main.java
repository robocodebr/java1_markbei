package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	//boolean b = random.nextBoolean();
	//double d = random.nextDouble();
//   float f = scanner.nextFloat();
//	String s = scanner.nextLine();
//	boolean b = scanner.hasNextLine();
//    boolean bd = scanner.hasNextInt();
	//System.out.println(random.nextDouble())
//        int n = scanner.nextInt();
//        int i = 0;
//        while(i<n){
//         System.out.println(random.nextInt());
//         i++;
//        }
//        int j = 100;
//        do{
//            System.out.println(random.nextInt(100)+100);
//            j++;
//        }while(j<200);

//        for(int k=0;k<=70;k+=7){
//         System.out.println(k);
//        for(int i=0;i<10;i++){
//            System.out.println(random.nextInt(20)-10);
        int j = scanner.nextInt();
        for(int i=0;i<10;i++){
          System.out.println(i+ "*"+ j + "="+i*j );


        }
        System.out.println();
        for(int l=1;l<=10;l++){
            System.out.println(j+ "/"+l  + "="+j/l );


        }
        System.out.println();
        for(int b=1;b<=10;b++){
            System.out.println(b+ "-"+j  + "="+(b-j) );


        }
        System.out.println();
        for(int v=1;v<=10;v++){
            System.out.println(j+ "+"+v  + "="+(j+v) );


        }
    }}




