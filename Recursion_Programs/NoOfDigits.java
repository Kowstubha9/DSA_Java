package Recursion_Programs;

import java.util.Scanner;

public class NoOfDigits {
    public static void DigitCountWithoutR(int n){
        int count=0;
        int num=n;
        while(n!=0){
            count+=1;
            n=n/10;
        }
        System.out.println("The number of digits in number "+num+" is: "+count);
    }
    
    // using recursion
    public static int DigitCountWithR(int n){
        if (n == 0) {
            return 0;
        } 
        else {
            return 1 + DigitCountWithR(n / 10);
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Without Using Recursion ");
        DigitCountWithoutR(n);
        System.out.println("Using Recursion");
        System.out.println("The number of digits in number "+n+" is: "+DigitCountWithR(n));  
    }
}
