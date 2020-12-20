package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Марк Бей",12);
        map.put("Сухарев Егор",10);
        map.put("Ситало Иван",10);
        map.put("Полищук Ярослав",10);
        map.put("Козяинчук Влад",10);
        int sum = 0;
       for(Map.Entry<String,Integer> pair: map.entrySet()){
        String key = pair.getKey();
        int value = pair.getValue();
        sum += value;
       }
       int average = sum/map.size();
       System.out.println(average);
        for(Map.Entry<String,Integer> pair: map.entrySet()){
            String key = pair.getKey();
            int value = pair.getValue();
          if(value>average){
              System.out.println(key);
          }
        }
//        ArrayList<String> list = new ArrayList<>();
//        String str = "dsada asd adadadwad adadadwad ad";
//        String s = "";
//        int max = 0;
//        String maxString = "";
//        for(int i =0;i<str.length();i++) {
//            if (str.charAt(i) == ' ') {
//                list.add(s);
//                if (map.containsKey(s)) {
//                    map.put(s, map.get(s) + 1);
//                } else {
//                    map.put(s, 1);
//                }
//                if (map.get(s) > max) {
//                    max = map.get(s);
//                    maxString = s;
//                }
//                s = "";
//
//            }else {
//                s+=str.charAt(i);
//            }
//        }
//        System.out.println(map);
//        System.out.println(max);
//        System.out.println(maxString);

        //String f = list.get(0);
       // for (int i = 0; i<list.size();i++){
      //      if()
//            if(f.length() < list.get(i).length()){
//                f =list.get(i);
//            }

        }}
        //System.out.println(f);



