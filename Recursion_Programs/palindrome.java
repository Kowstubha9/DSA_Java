package Recursion_Programs;

import java.util.Scanner;

public class palindrome {
    public static void PalindromeNumWithoutR(int n){
        int rev=0;
        int num=n;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }

        if(num==rev){
            System.out.println("The given number "+num+" is a palindrome");
        }
        else{
            System.out.println("The given number "+num+" is not a palindrome");
        }
        
    }
    
    // using recursion
    public static int PalindromeNumWithR(int n, int rev){
        if (n == 0) 
            return rev;

        rev = (rev * 10) + (n % 10);

        return PalindromeNumWithR(n / 10, rev);

    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Without Using Recursion ");
        PalindromeNumWithoutR(n);
        
        System.out.println("Using Recursion");
        if(n==PalindromeNumWithR(n,0)){
            System.out.println("The given number "+n+" is a palindrome");
        }
        else{
            System.out.println("The given number "+n+" is not a palindrome");
        }
    }
}
