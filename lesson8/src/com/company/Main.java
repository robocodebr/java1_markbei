package com.company;
 import java.util.*;
public class Main {

    public static void main(String[] args) {
//    int[] arr = new int[]{1,10,5,11,15,30,31,33};
//    int[] arr2 = new int[10];
    Random random= new Random();
    Scanner scanner = new Scanner(System.in);
   // int s = scanner.nextInt();
//    int[] arr = new int[]{1,3,7,1,6,9,4,3,5,0};
      int[] arr = new int[]{1,-5,10,15,30,-67,-8,-10,11,12};
     int sum=0;
      for(int i =0;i<arr.length;i++){
          if(arr[i]>0 && arr[i]%2==0){
          sum += arr[i];
          }
      }
      System.out.println(sum);
//    int min = -100;
//    int max = 100;
//    int step = 5;
//    for(int i = min;i<=max;i+=step){
//       System.out.println(i);
//    }
//    for(int i=0;i<arr.length;i++){
//      if(arr[i]==s) {
//          System.out.println(arr[i]);
//          arr[i]=0;
//      }
//    }
//    System.out.println(Arrays.toString(arr));
//    Arrays.sort(arr);
//    System.out.println(Arrays.toString(arr));
//    String[] arr = new String[5];
//    for(int i = 0;i<arr.length;i++){
//        arr[i] = scanner.nextLine();
//    }
//    System.out.println(Arrays.toString(arr));
//    Arrays.sort(arr);
//    System.out.println(Arrays.toString(arr));
//    int temp = arr[2];
//    arr[2] = arr[3];
//    arr[3] = temp;
//    System.out.println(arr[2]);
//        for(int i = 1;i<arr.length;i++){
//            for(int j = 0;j<arr.length-i;j++){
//              if(arr[j]>arr[j+1]){
//                  int t = arr[j];
//                  arr[j] = arr[j+1];
//                  arr[j+1]=t;
//              }
//            }
//        }
//        for(int i = 0;i<arr2.length;i++){
//            arr2[i] = random.nextInt(10);
//        }
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr2));
    }
}
