package com.arrays_Assignment;

import java.util.Scanner;

public class Present1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[]=new int[size];
		
		System.out.println("enter the array elements: ");
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.print("enter the key: ");
		int key=sc.nextInt();
		boolean present=false;
		for(int i=0;i<size;i++) {
			if(key==arr[i] ){
				present=true;
			}
		}
		System.out.println(present);
		
	sc.close();	
	}
}
