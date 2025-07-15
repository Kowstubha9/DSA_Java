package Recursion_Programs;

import java.util.Scanner;

public class EvenNumbersFrom2toN {
    public static void even(int n){
        for(int i=2;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        
    }
    
    // using recursion
    public static void evenWithR(int n){
        if(n<2){     
            return;
        }
        
        evenWithR(n-1);
        
        if(n%2==0){
            System.out.println(n);
        } 
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Without Using Recursion ");
        even(n);
        System.out.println("Using Recursion");
        evenWithR(n);  
    }

}
