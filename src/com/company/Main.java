package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
//	int year = 2006;
//	int month = 9;
//	int day = 3;
	String name = "Mark";
	int n = name.length();
	String surname = "Bei";
    int s = surname.length();
	String middlename = "Oleksandrovich";
	int m = middlename.length();
	String one = "0123456";
	String two = "1391215";
	String three = "149864";
	int o = one.length();
	int t = two.length();
	int th = three.length();
	Random random  = new Random();
	random.nextInt();
	System.out.println(random.nextInt());
	int a = random.nextInt();
	int b =random.nextInt();
	int c = random.nextInt();

//	if(day>month){
//	    System.out.println(day);
//    }else if(year<month){
//	    System.out.println(month);
//    }else{
//		System.out.println(year);
//	}

//	if(n<s){
//		System.out.println(surname);
//	}else if(n>m){
//		System.out.println(name);
//		}else{
//		System.out.println(middlename);
//	}
		if(n>m && n>s){
			System.out.println(name);
		}else if(s>m && s>n){
			System.out.println(surname);
		}else{
			System.out.println(middlename);
		}
		if(a>b && a>c){
			System.out.println(a);
		} else if(b>a && b>c){
			System.out.println(b);
		}else{
			System.out.println(c);
		}
    }
}
