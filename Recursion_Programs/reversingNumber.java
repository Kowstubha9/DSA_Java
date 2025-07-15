package Recursion_Programs;

import java.util.Scanner;

public class reversingNumber {
    public static void ReversedNumWithoutR(int n){
        int rev=0;
        int num=n;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        System.out.println("The reverse of number "+num+" is: "+rev);
    }
    
    // using recursion
    public static void ReversedNumWithR(int n){
        if (n < 10) {
            System.out.println(n);
            return;
        }

        else {
            System.out.print(n % 10);
            ReversedNumWithR(n / 10);
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Without Using Recursion ");
        ReversedNumWithoutR(n);
        System.out.println("Using Recursion");
        System.out.print("The reverse of number "+n+" is: ");
        ReversedNumWithR(n);  
    }
}
