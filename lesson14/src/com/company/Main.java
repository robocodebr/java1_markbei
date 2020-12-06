package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
    ArrayList<String> list = new ArrayList();
    list.add("Zahar");
    list.add("Sg");
    list.add("Lesha");
    list.add("Roma");
    list.add("Sasha");
    list.add("Artem");
    int g = random.nextInt(list.size());
    System.out.println(list.get(g));
    System.out.println(g);
    System.out.println(System.currentTimeMillis());
//    list.add("Contains");
//    list.add(0,"Add");
//    System.out.println(list.size());
//    list.clear();
//    list.add("set");
//    list.add("get");
//    System.out.println(list.contains("get"));
    }
}
