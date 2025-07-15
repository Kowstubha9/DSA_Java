package Recursion_Programs;
import java.util.*;

public class productOfNNaturalNumbers {
    // without using recursion
    public static void ProductWithoutRecursion(int n){
        int prod=0;
        for(int i=1;i<=n;i++){
            prod*=i;
        }
        System.out.println(prod);
    }

     // using recursion
    public static int ProductWithRecursion(int n){
        if(n==1){     
            return 1;
        }
        else{
            return n*ProductWithRecursion(n-1);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Without Using Recursion ");
        ProductWithoutRecursion(n);
        
        System.out.println("Using Recursion ");
        ProductWithRecursion(n);
    }    

}
