package Array_programs;

import java.util.Scanner;

public class linearSearchOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of elements:");
		int n = sc.nextInt();

        System.out.println("Enter the elements:");
		int arr[] = new int[n];
		for (int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

        System.out.println("Enter the target element:");
        int target=sc.nextInt();
        int index=-1;

        for (int i =0; i<n; i++) {
			if(arr[i]==target){
                index=i;
            }
		}

        if(index==-1){
            System.out.println("Target element didn't found");
        }
        else{
            System.out.println("Given target element "+target+" found at index "+index);
        }
    }
}
