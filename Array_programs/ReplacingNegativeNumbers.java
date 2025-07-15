package Array_programs;

import java.util.Scanner;

public class ReplacingNegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of elements:");
		int n = sc.nextInt();

        System.out.println("Enter the elements:");
		int arr[] = new int[n];
		for (int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

        for(int i=0;i<n;i++){
            if(arr[i]<0){
                arr[i]=0;
            }
        }

        System.out.println("Array after replacing negative elements with 0:");
		for (int i =0; i<n; i++) {
			System.out.println(arr[i]);;
		}
    }
}
