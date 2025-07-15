package Recursion_Programs;

import java.util.Scanner;

public class sumOfSquares {
    // without using recursion
    public static void SquareSumWithoutRecursion(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+(i*i);
        }
        System.out.println(sum);
    }

     // using recursion
    public static int SquareSumWithRecursion(int n){
        if(n==1){     
            return 1;
        }
        else{
            return (n*n)+SquareSumWithRecursion(n-1);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Without Using Recursion ");
        SquareSumWithoutRecursion(n);
        
        System.out.println("Using Recursion ");
        System.out.println(SquareSumWithRecursion(n));
    }    

    
}
