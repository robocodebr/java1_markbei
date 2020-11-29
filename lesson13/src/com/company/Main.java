package com.company;
import java.util.*;
public class Main {
    public static void method1(ArrayList str){
      Collections.sort(str);
      System.out.println(str);
    }
    public static void method2(ArrayList str){
      Collections.sort(str,Collections.reverseOrder());
      System.out.println(str);
    }

    public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    ArrayList<String> str  =new ArrayList<>();
    for(int i = 0;i<n;i++){
        str.add(scanner.next());
    }

    System.out.println(str);
    method1(str);
    method2(str);
//    String s = scanner.next();
//    if(str.contains(s)){
//        int index_word = str.indexOf(s);
//        str.remove(index_word);
//
//    }
//        System.out.println(str);
//    ArrayList<String> people = new ArrayList<>();
//    people.add("Yehor");
//    people.add("Vanya");
//    people.add("Mark");
//    if(people.contains("Yehor")){
//        System.out.println("List contains Yehor");
//        int index_Yehor = people.indexOf("Yehor");
//        people.remove(index_Yehor);
//    ArrayList<String> colors = new ArrayList<>();
//    colors.add("Red");
//    colors.add("Blue");
//    colors.add("Yellow");
//    colors.set(2,"Green");
//    for(int i = 0;i< colors.size();i++){
//        System.out.println(colors.get(i));
//    }
//    System.out.println(people);
//    int n =random.nextInt(100);
//    ArrayList<String> list = new ArrayList<>();
//    list.add("Hello");
//    ArrayList<Integer> list1 = new ArrayList<>();
//    for(int i = 0;i<n;i++){
//     list1.add(random.nextInt(100));
//     System.out.println(list1.get(i));
//    }
//    list1.remove(0);
//    if(list1.contains(3)){
//        System.out.println("3 in list");
//    }else{
//        System.out.println("3 dont in list");
//    }
//    list1.set(list1.size()-1,100);
//    System.out.println(list1);
//    if(list1.contains(5)){
//        System.out.println(list1.indexOf(5));
//    }
//    list.clear();
//    System.out.println(list);
    }
}
