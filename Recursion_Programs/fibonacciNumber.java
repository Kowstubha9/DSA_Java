package Recursion_Programs;

import java.util.Scanner;

public class fibonacciNumber {
    public static int fib(int n){
        if(n==0){     
            return 0;
        }
        else if(n==1||n==2){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n+" th fibonacci number is "+fib(n)); 
    }
    
}
