package Array_programs;

import java.util.Scanner;

public class swappingOf1stAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of elements:");
		int n = sc.nextInt();

        System.out.println("Enter the elements:");
		int arr[] = new int[n];
		for (int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

        System.out.println("Array before swapping:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
		
        System.out.println(" ");

        // swapping
        int temp=arr[0];
        arr[0]=arr[n-1];
        arr[n-1]=temp;

		System.out.println("Array after swapping:");
		for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    
}
