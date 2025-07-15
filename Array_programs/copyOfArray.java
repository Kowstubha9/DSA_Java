package Array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class copyOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of elements:");
		int n = sc.nextInt();

        System.out.println("Enter the elements:");
		int arr[] = new int[n];
		for (int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));
		
		int arr_copy [] = new int[n];
		for (int i =0; i<n;i++) {
			arr_copy[i] = arr[i];
		}
		
		System.out.println("Copy of an array:");
		System.out.println(Arrays.toString(arr_copy));
    }
    
}
