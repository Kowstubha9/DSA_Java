package Recursion_Programs;
import java.util.*;

public class sumOfNNaturalNumbers {
    // without using recursion
    public static void SumWithoutRecursion(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }

     // using recursion
    public static int SumWithRecursion(int n){
        if(n==1){     
            return 1;
        }
        else{
            return n+SumWithRecursion(n-1);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Without Using Recursion ");
        SumWithoutRecursion(n);
        
        System.out.println("Using Recursion ");
        System.out.println(SumWithRecursion(n));
    }    

}
