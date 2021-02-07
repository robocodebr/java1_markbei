package com.company;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
//    HashMap<String, Integer> hp = new HashMap<>();
//    hp.put("Kutz", 097);
//
    try{
	FileReader fr = new FileReader("file.txt");
	FileWriter fw = new FileWriter("file2.txt");
	Scanner scanner = new Scanner(fr);
	int quantity = 0;
	int allrating = 0;
	while(scanner.hasNextLine()){
		String currentText = scanner.nextLine();
		String[] now = currentText.split(" ");
		quantity++;
		int rating = Integer.parseInt(now[1]);
		allrating += rating;
		if(rating<=3){

			fw.write(currentText + "\n");
		}
	}System.out.println(allrating/quantity);
	fw.close();
	fr.close();


	}catch(IOException i){
    System.out.println("Error");
	}
//    	try{
//		FileReader fr = new FileReader("file.txt");
//			Scanner scanner = new Scanner(fr);
//			String s = scanner.nextLine();
//			String[] strArr = s.split(" ");
//			String result = "";
//			for(int i = 0;i<strArr.length;i++){
//				int num = Integer.parseInt(strArr[i]);
//				if(num%3 == 0){
//					result += num+" ";
//				}
//			}
//		fr.close();
//		FileWriter fileWriter = new FileWriter("file.txt");
//		fileWriter.write(result);
//		//	Scanner sc= new Scanner(fr);
//    	fileWriter.close();
//		}catch(Exception i){
//    	System.out.println("Error");
//		}
//	try{
//	    FileWriter fw = new FileWriter("file.txt");
//	    fw.close();
//	    fw.write("Hello");
//    }catch(IOException c){
//	    System.out.println("Error");
//    }finally{
//		System.out.println("always done");
//	}
    }
}
