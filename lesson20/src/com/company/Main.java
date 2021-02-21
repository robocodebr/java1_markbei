package com.company;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args)throws Exception {
        String[][] students = new String[10][3];
        FileReader fr = new FileReader("file.txt");
        Scanner scanner = new Scanner(fr);
        int i = 0;
        int[] grades = new int[10];
        while(scanner.hasNextLine()){
            String s = scanner.nextLine();
            String[] arr = s.split(" ");
            students[i] = arr;
            int grade  = Integer.parseInt(arr[arr.length-1]);
            grades[i] = grade;
            i++;
            System.out.println(Arrays.toString(arr));

        }
        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));
        fr.close();

        FileWriter fw = new FileWriter("file1.txt");
        int counter = 0;
        for(int j = 0;j<students.length && counter<3;j++){
          int bestgrade = grades[grades.length-1];
          int secondgrade = grades[grades.length-2];
          int thirdgrade = grades[grades.length-3];
          int currentgrade = Integer.parseInt(students[j][students[j].length-1]);
          if(currentgrade == bestgrade || currentgrade == secondgrade || currentgrade == thirdgrade){
              fw.write(students[j][0] + " " + students[j][1]+ " " + students[j][students[j].length-1] + "\n");
              counter++;
          }
        }
        fw.close();
//        FileWriter fw = new FileWriter("file.txt");
//        Scanner scanner = new Scanner(System.in);
//
//        for(int i = 0;i<10;i++){
//            System.out.println("name");
//            String text = scanner.nextLine();
//            fw.write(text+" ");
//            System.out.println("subject");
//            text = scanner.nextLine();
//            fw.write(text+" ");
//            System.out.println("grade");
//            int t = scanner.nextInt();
//            fw.write(t+" \n");
//            scanner.nextLine();
//        }
//        fw.close();
//     FileReader fr = new FileReader("file.txt");
//     Scanner scanner = new Scanner(fr);
//     int i = 0;
//     while(scanner.hasNextLine()){
//         String s = scanner.nextLine();
//         System.out.println(s.length());
//         String[] st = s.split(" ");
//         System.out.println(st.length);
//         i++;
//     }
//     System.out.println(i);
//     fr.close();
//    FileWriter fw = new FileWriter("file.txt");
//   Scanner scanner = new Scanner(System.in);
//   String st = scanner.nextLine();
//   fw.write(st);
//   fw.close();

//	FileReader fr = new FileReader("file.txt");
//	Scanner scanner = new Scanner(fr);
//    fr.close()
//	Scanner sc = new Scanner(System.in);
//	String scan = sc.nextLine();
//	int i = 0;
//	while(scanner.hasNextLine()){
//	    String s = scanner.nextLine();
//	    String[] str = s.split(" ");
//	    for(int j = 0;i<str.length;i++){
//	        if(str[j].equals(scan)){
//	            System.out.println("true");
//            }
//
//        }
//	    i+= s.length();
    }
    //System.out.println(i);
	;
    }

