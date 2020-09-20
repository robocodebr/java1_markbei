package com.company;

import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner ;
    scanner = new Scanner(System.in);
//    String src = scanner.nextLine();
 //   int i = scanner.nextInt();
 //   int j = scanner.nextInt();
        String s = scanner.nextLine();
        int i = Integer.parseInt(""+s.charAt(0)+""+s.charAt(1));
        int j = Integer.parseInt(""+s.charAt(3)+""+s.charAt(4));
        if("+".equals(s.charAt(2)+"")){
        System.out.println(i+j);
        }else if("-".equals(s.charAt(2)+"")){
        System.out.println(i-j);
        }else if("*".equals(s.charAt(2)+"")){
        System.out.println(i*j);
        }else if("/".equals(s.charAt(2)+"")){
        System.out.println(i/j);
        }

//    String name = scanner.nextLine();
//    String surname = scanner.nextLine();
//    String middlename = scanner.nextLine();
//    System.out.println("our string " + name);
//    System.out.println("our string " + surname);
 //   System.out.println(name+ " " + surname + " "+ middlename);
//        System.out.println(src + src + src);
//        System.out.println(j + i);
//        System.out.println(j - i);
//        System.out.println(j * i);
//        System.out.println(j / i);
        System.out.println(s.equals("text"));

    }
}
