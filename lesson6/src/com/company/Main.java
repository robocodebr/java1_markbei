package com.company;
 import java.util.*;
public class Main {

  public static void println(String arg1,String arg2){
      System.out.println("arg1= " + arg1);
      System.out.println("arg2= " + arg2);
  }

 public static void func(String name){
//   System.out.println("Hello " + name);

 }

 //public static int suma(int x,int y){

  //    return x+y;
//}

 public static String str(){

      return "addfe";
 }

 public static int scan(int height,int width,int length){
 int f = height*width*length;
 System.out.println(f);
 return height*width*length;

 }

 public static int suma(int i,int j){
     System.out.println(i+j);
     return i+j;
 }

 public static int min(int i,int j){
     System.out.println(i-j);
     return i-j;
 }

 public static int umn(int i,int j){
     System.out.println(i*j);
     return i*j;
 }

 public static float del(int i,int j){
     System.out.println(i/j);
    return i/j;
 }

    public static void main(String[] args) {
       // func("func");
       // String s = "text";
        Scanner scanner = new Scanner(System.in);
        String operator=scanner.nextLine();
        if(operator.equals("+")){
           System.out.println(suma(scanner.nextInt(),scanner.nextInt()));
        }else if(operator.equals("-")){
            System.out.println(min(scanner.nextInt(),scanner.nextInt()));
        }else if(operator.equals("*")){
            System.out.println(umn(scanner.nextInt(),scanner.nextInt()));
        }else if(operator.equals("/")){
            System.out.println(del(scanner.nextInt(),scanner.nextInt()));
        }
     // scan(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
       // suma(1,2);
//        func(s);
//        println("text","text");
    }
}
