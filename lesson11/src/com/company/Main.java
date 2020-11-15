package com.company;
import java.util.*;
public class Main {

public static int[][] array(int arr[][]){

    int[][] arr2 = new int[arr.length][arr[0].length];
    for(int i = 0;i<(int)arr.length/2;i++){
    	for(int j = 0;j<arr[i].length;j++){
    		int temp = arr[i][j];
    		arr[i][j] = arr[arr.length-1-i][arr.length-1-j];
			arr[arr.length-1-i][arr.length-1-j] = temp;
		}
	}
    for(int i =0;i<arr.length;i++){
    	System.out.println(Arrays.toString(arr[i]));
	}
    arr2 = Arrays.copyOf(arr,arr.length);
    return arr2;

//	for(int i = 0;i<arr.length;i++){
//		System.out.println(Arrays.toString(arr[i]));
//	}
}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int a = scanner.nextInt();
//		int f = scanner.nextInt();
		int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		Random random = new Random();
		//int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				arr[i][j] = random.nextInt(10) ;
//                if(arr[i][j]%2 == 0){
//                	sum+=arr[i][j];
//				}
//
//			}
//			System.out.println(Arrays.toString(arr[i]));
//		}
			//System.out.println("sum = " +sum);
//		int sum = 0;
//		for(int i = 0;i<arr.length;i++){
//		for(int j = 0;j<arr.length;j++) {
//			arr[i][j] = random.nextInt(20)-10;
//
//		}sum += arr[arr.length-1-i][i];
//
//			System.out.println(Arrays.toString(arr[i]));
//	}
//		System.out.println("sum = " + sum);


			array(arr);
//	for(int i = 0;i<arr.length;i++){
//		for(int j = 0;j<arr.length;j++) {
//			arr[i][j] = random.nextInt(10);
//		}
//	}
//		System.out.println(Arrays.deepToString(arr));
//		int s = scanner.nextInt();
//		boolean element = false;
//		int f=0;
//		for(int g = 0;g<arr.length;g++){
//			for(int k = 0;k<arr.length;k++){
//				if(s==arr[g][k]){
//					element = true;
//				}
//			}
//			if(element == false){
//				f+=1;
//			}
//		}
//		System.out.println("don't have = " + f);

//	int min =10;
//	int max =0;
//	for(int i = 0;i<arr.length;i++){
//	    for(int j = 0;j<arr.length-1;j++){
//	        arr[i][j]= random.nextInt(10);
//	       if(arr[i][j]<min){
//	       	min = arr[i][j];
//		   }
//	       if(arr[i][j]>max){
//	       	max = arr[i][j];
//		   }
//        }
//
//    }
//	System.out.println(Arrays.deepToString(arr));
//    System.out.println("max = " + max);
//    System.out.println("min = " + min);
		}
	}
