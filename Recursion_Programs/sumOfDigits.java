package Recursion_Programs;

import java.util.Scanner;

public class sumOfDigits {
    public static void DigitSumWithoutR(int n){
        int sum=0;
        int num=n;
        while(n!=0){
            int digit=n%10;
            sum+=digit;
            n=n/10;
        }
        System.out.println("The sum of digits of number "+num+" is: "+sum);
    }
    
    // using recursion
    public static int DigitSumWithR(int n){
        if (n == 0) {
            return 0;
        } 
        else {
            return (n % 10) + DigitSumWithR(n / 10);
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Without Using Recursion ");
        DigitSumWithoutR(n);
        System.out.println("Using Recursion");
        System.out.println("The sum of digits of number "+n+" is: "+DigitSumWithR(n));  
    }
    
}
