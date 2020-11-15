package com.company;
import java.util.*;
public class Main {

//    public static void method1(){
//        Random random = new Random();
//     int arr[][] = new int[3][3];
//     for(int i = 0;i<arr.length;i++){
//         for(int j = 0;j<arr.length;j++){
//             arr[i][j] = random.nextInt(100);
//            // System.out.print(arr[i][j]+"\t");
//
//         }
//         System.out.println();
//     }
//        System.out.println(Arrays.deepToString(arr));
//     int sum = 0;
//     for(int d = 0;d<arr.length;d++){
//        sum += arr[arr.length-1-d][d];
//     }
//        System.out.println("sum = " + sum);
//    }

    public static void main(String[] args) {
//        method1();
   // int[][] arr = new int[3][10];
    int[][] arr1 = {{1,2,3},{2,3,4}};
    int[][] arr2 = {{4,7,2},{3,8,1}};
    int[][] arr3 = Arrays.copyOf(arr1, arr1.length);
    System.out.println(Arrays.deepEquals(arr1,arr3));
    System.out.println(Arrays.deepToString(arr3));
//
//        for(int i = 0;i<arr2.length;i++){
//            for(int j = 0;j<arr2.length;j++){
//                System.out.println(arr2[i][j]+" ");
//            }
//        }
        Random random = new Random();

//        for(int i = 0;i<arr1.length;i++){
//          for(int j = 0;j<arr1.length;j++){
//              arr1[i][j] = random.nextInt(100);
//              System.out.print(arr1[i][j]+" ");
//          }
//          System.out.println();
//        }
//        for(int s = 0;s<3;s++){
//          System.out.print(arr1[s][s]+" ");
//        }
//        for(int d = 0;d<3;d++){
//            System.out.print(arr1[arr1.length-1-d][d]+" ");
//        }
    }
}
