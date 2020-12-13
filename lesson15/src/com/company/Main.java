package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();
    String atr = " dsada asd adadadwad  ad";
    String s = "";

    for(int i =0;i<atr.length();i++){
    	if(atr.charAt(i) == ' '){
    		list.add(s);
         s = "";
		}else{
    		s += atr.charAt(i);
		}


	}
    String f = list.get(0);
for (int i = 0; i<list.size();i++){
	if(f.length() < list.get(i).length()){
	f =list.get(i);
	}
	System.out.println(list.get(i));
}
System.out.println("max"+f);
	//HashMap<Integer,String> hashMap = new HashMap<>();
	//hashMap.put(0,scanner.nextLine());
//	int o = 0;
//	String s = scanner.nextLine();
//	String s2 = scanner.nextLine();
//	char c = s2.charAt(0);
//	//hashMap.containsValue(scanner.nextLine());
//	for(int i = 0;i<s.length();i++){
//		if(s.charAt(i) == c){
//			o++;
//		}
//	}
//	System.out.println(o);
//	hashMap.put(1111,"Surname 1");
//	hashMap.put(1234,"Surname 2");
//	System.out.println(hashMap.get(1234));
//	System.out.println(hashMap.size());
//	System.out.println(hashMap.containsKey(1234));
//	System.out.println(hashMap.containsValue("Surname 2"));
//	hashMap.remove(1234);
//	System.out.println(hashMap.size());
//	hashMap.clear();
//	System.out.println(hashMap.isEmpty());
//	HashMap<Integer,String> hash = new HashMap<>();
//	hash.put(0,"banana");
//	hash.put(1,"apple");
//	hash.put(2,"orange");
//	hashMap.putAll(hash);
//	System.out.println(hashMap.size());
    }
}
