package Array_programs;

import java.util.Scanner;

public class frequencyOfAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of elements:");
		int n = sc.nextInt();

        System.out.println("Enter the elements:");
		int arr[] = new int[n];
		for (int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

        System.out.println("Enter the element:");
        int ele=sc.nextInt();
        int freq=0;

        for (int i =0; i<n; i++) {
			if(arr[i]==ele){
                freq += 1;
            }
		}

        System.out.println("Frequency of "+ele+": "+freq);
    }
}
