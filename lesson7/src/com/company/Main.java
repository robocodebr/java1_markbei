
package com.company;

import java.util.*;
public class Main {

	public static void main(String[] args) {
//		String[] arr = {"Volvo", "BMW", "Mazda", "Ford"};
//		int[] ar = {1, 2, 3, 4};
//		for (int i = 0; i <= 3; i++) {
//
//			System.out.println(arr[i]);
//			System.out.println(ar[i]);
//		}
//		int[] agg = new int[10];
//		for(int j = 0;j<=agg.length;j++){
//			agg[j] = 1;
//		}
//		System.out.println(Arrays.toString(agg));
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		float[] arr = {1,5,30,7,17,20,10};
		float x = arr[0];
		for(int i = 2;i<arr.length;i+=2){
		if(arr[i]>x){
		x=arr[i];
		}
		}
		System.out.println(x);
//		boolean b = false;
//        int x = 7;
//		int m = scanner.nextInt();
//		int n = scanner.nextInt();
//		int[][] arr2 = new int[m][n];
//		for(int i=0;i<m;i++) {
//			for(int j=0;j<n;j++){
//
//				arr2[i][j]=random.nextInt(10);
//				if(arr2[i][j]==x){
//					System.out.println(i+" "+j);
//					b =true;
//				}
//			}
//			System.out.println(Arrays.toString(arr2[i]));
//		}
//	if(b != true) {
//			System.out.println("not found");
//		}
		}
		//int[] arr = new int[10];
		//arr[10] = random.nextInt(20)-10;
//		for(int i = 0;i<arr.length;i++) {
//			arr[i] = random.nextInt(20)-10;
//            System.out.println("arr[" + i + "]=" + arr[i]);
//		}
//		System.out.println(Arrays.toString(arr));

		}



