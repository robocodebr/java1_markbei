package com.company;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String s = scanner.next();
        String sc = scanner.next();
        int d = 0;
        for(int i =0;i<s.length();i++){
        	for(int j = 0;j<sc.length();j++) {
				if ((s.charAt(i)+"").equals(sc.charAt(j)+"")) {
                  d += 1;
				}
			}
		}
        System.out.println(d);
//		int index1 = s.indexOf('H');
//		int index2 = s.indexOf('o');
//		int index3 = s.indexOf('W');
//
//		System.out.println("Мы ищем букву 'H' в строке "+s+".");
//		System.out.println("Индекс этой буквы : " + index1);
//
//		System.out.println("Мы ищем букву 'O' в строке "+s+".");
//		System.out.println("Индекс этой буквы : " + index2);
//
//		System.out.println("Мы ищем букву 'w' в строке "+s+".");
//		System.out.println("Индекс этой буквы : " + index3);
//		String str = "Обожаю язык программирования Java";
//		System.out.println("Сабстринг от 27 дл конца: "+str.substring(27));
//		System.out.println("Сабстринг от 0 до 8: " +str.substring(0,8));
//		System.out.println("Сабстринг от 27 до 31: "+str.substring(27,31));
		//String s = "text";
//		String oldString = "Java";
//		String newString = oldString.replace("a","i");
//		System.out.println("Old string: " + oldString);
//		System.out.println("New string: " + newString);
		//String str = "ПРИВЕТ КАК ДЕЛА";
//		String s2 = new String("literal");
//		if (s == s2)
//			System.out.println("s == s2");
//		if (s.equals(s2))
//			System.out.println("s.equals(s2)");
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) == '?') {
//				System.out.println("Это - вопрос.");
//			} else if (s.charAt(i) == '!') {
//				System.out.println("Это - восклицательное предложение.");
//			} else if (s.charAt(i) == '.') {
//				System.out.println("Это - повествовательное предлодение.");
//			}
//
//		}
		//System.out.println(s.replace("Привет, как дела?","Привет как сам"));
		//System.out.println(s.toUpperCase());
		//System.out.println(str.toLowerCase());
		//System.out.println(s.substring(0,2));
		//System.out.println(s.substring(2,4));
		//System.out.println(s.indexOf("x"));
	}
}
