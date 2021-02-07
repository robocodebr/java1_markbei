package com.company;
import java.util.*;
import java.io.FileWriter;
import java.io.FileReader;
public class Main {

    public static void main(String[] args) throws Exception {
		String[] str = new String[]{};
		FileReader fr = new FileReader("file.txt");
		Scanner sc = new Scanner(fr);
		String text  =sc.nextLine();
		String[] textArr = text.split(" ");
		for(int i = 0;i<textArr.length;i++){
			String word = "";
			for(int j = 0;j<textArr[i].length()-1;j+=2) {
				word += (textArr[i].charAt(j)+"").toLowerCase() + (textArr[i].charAt(j+1)+"").toUpperCase();
				textArr[i] = word;
				//	Character firstLetter = (textArr[i].charAt(0));
				//	String first = firstLetter.toString().toUpperCase();
				//	textArr[i]  = first + textArr[i].substring(1);
			}
	}
		System.out.println(Arrays.toString(textArr));
		fr.close();
//    String[] str = new String[]{};
	FileWriter fw = new FileWriter("file.txt");
    //fw.write("java java java");
//	fw.close();
//	FileReader fr = new FileReader("file2.txt");
//	Scanner sc = new Scanner(fr);
//	String text = sc.nextLine();
//	System.out.println(text);
//	String[] textArr = text.split("\\.");
	//System.out.println(Arrays.toString(textArr));
//	for(int i = 0;i<textArr.length;i++){
//		Character firstLetter = (textArr[i].charAt(0));
//		String first = firstLetter.toString().toUpperCase();
//		textArr[i]  = first + textArr[i].substring(1);
//	}
	//	System.out.println(Arrays.toString(textArr));
//	fr.close();
//		FileWriter filew = new FileWriter("file2.txt");
//	//	filew.write("");
	for(int i =0;i<textArr.length;i++) {

		fw.write(textArr[i] + " ");
   }
	fw.close();
    }
}
