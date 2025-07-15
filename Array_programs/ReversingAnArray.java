package Array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class ReversingAnArray {
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
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
		
        System.out.println(" ");
		System.out.println("Reversed Array:");
		for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
