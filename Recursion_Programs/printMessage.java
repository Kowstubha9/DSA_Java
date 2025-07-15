package Recursion_Programs;
import java.util.*;

public class printMessage {
    public static void printMessage(int n){
        if(n==0){     
            return;
        }
        System.out.println("Hello my dear");
        printMessage(n-1);         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printMessage(n); 
    }

}
