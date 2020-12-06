package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	HashMap<String,Integer> hashMap = new HashMap();
	hashMap.put("banana",30);
	hashMap.put("apple",50);
	hashMap.put("orange",60);
//	int s = scanner.nextInt();
//	String sc = scanner.nextLine();
//		hashMap.put(sc,s);
		System.out.println(hashMap);
		int i  = 0;
    while(i<10){
		int s = scanner.nextInt();
		String sc = scanner.next();
		hashMap.put(sc,s);
    	i++;
		}
    System.out.println(hashMap);
	//HashMap<Character,Integer> hashmap = new HashMap();
//		String str= scanner.nextLine();
//	for(int i = 0;i<str.length();i++){
//	char currentElement = str.charAt(i);
//	if(hashMap.containsKey(currentElement)){
//		hashMap.put(currentElement, hashMap.get(currentElement)+1);
//	}else{
//		hashMap.put(currentElement, 1);
//	}
//
//	}
//	char max = ' ';
//	int maks = 0 ;
//	for(HashMap.Entry<Character,Integer> element: hashMap.entrySet()){
//
//		System.out.println(element.getKey());
//		System.out.println(element.getValue());
//		if(element.getValue()>max){
//			max = element.getKey();
//			maks = element.getValue();
//		}
//	}
//	System.out.println(hashMap);
//		System.out.println(max);
//		System.out.println(maks);
//	hashMap.put(1111,"Фамилия 1");
//	hashMap.put(1234,"Фамилия 2");
//	System.out.println(hashMap);
//	hashMap.put(1111,"Surname 3");
//	System.out.println(hashMap);
    }
}
