package Recursion_Programs;

import java.util.Scanner;

public class sumOfArray {
    public static void arrSumWithoutR(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        } 
        System.out.println("The sum of all array elements is "+sum);
    }
    
    // using recursion
    public static int arrSumWithR(int arr[],int n){
        if(n==0){     
            return 0;
        }
        
        return arr[n-1]+arrSumWithR(arr,n-1);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Without Using Recursion ");
        arrSumWithoutR(arr);
        System.out.println("Using Recursion");
        System.out.println("The sum of all array elements is "+arrSumWithR(arr,n));  
    }
}
