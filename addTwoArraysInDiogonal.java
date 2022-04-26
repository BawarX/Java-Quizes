package file;

import java.util.Arrays;
import java.util.Scanner;

public class danielSol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" it's an array two dimention , like matrix"
				+ " , this program to add two matrix so these two matrix must be have same size of row and column ");
		System.out.println("please enter how many size of rows ");
		int row = sc.nextInt();
		System.out.println("please enter how many size of columns");
		int column = sc.nextInt();
		int[][] arr1 = new int[row][column];
		int[][] arr2 = new int[row][column];
	
		System.out.println("please enter the element of first array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("[" + i + "]" + "," + "[" + j + "]=");
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("please enter the element of second array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("[" + i + "]" + "," + "[" + j + "]=");
				arr2[i][j] = sc.nextInt();
			}
		}
	addition(arr1,arr2);
		
	    

	}
	public static int addition(int arr9[][],int arr8 [][]){
		
		
		
		int[][] sumd=new int [arr9.length][arr8.length];
		
	
		
		int basket=0;
	
		for(int i=0;i<arr9.length;i++) {
			
			for(int j=0;j<arr9[i].length;j++) {
				
		if(i==j||i+j==arr9.length-1) {
			
			sumd[i][j]=arr9[i][j]+arr8[i][j];
			
			basket=basket+sumd[i][j];
			
		}	
			}
			System.out.println();
		}
		System.out.println(Arrays.deepToString(sumd));
		System.out.println("diogonal sum "+basket);
		
		return basket;
		
	}

}
