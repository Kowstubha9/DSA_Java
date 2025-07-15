package Recursion_Programs;

import java.util.Scanner;

public class printingArrayElements {
    public static void arrWithoutR(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        } 
    }
    
    // using recursion
    public static void arrWithR(int arr[],int n){
        if(n==0){     
            return;
        }
        
        arrWithR(arr,n-1);
        
        System.out.println(arr[n-1]);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Without Using Recursion ");
        arrWithoutR(arr);
        System.out.println("Using Recursion");
        arrWithR(arr,n);  
    }
}
