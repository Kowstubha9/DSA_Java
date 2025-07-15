package Array_programs;

import java.util.Scanner;

public class countOfPosAndNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of elements:");
		int n = sc.nextInt();

        System.out.println("Enter the elements:");
		int arr[] = new int[n];
		for (int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
        
        int positive_count=0;
        int negative_count=0;

        // count of positive and negative elements
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                positive_count+=1;
            }
            else{
                negative_count+=1;
            }
        }

        System.out.println("Count of positive numbers in the given array: "+positive_count);
        System.out.println("Count of negative numbers in the given array: "+negative_count);
        
    }
}
