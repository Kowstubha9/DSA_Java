package Array_programs;

public class countOfEvenAndOdd {
    public static void main(String[] args) {
        int []a={10,2,30,13,45};
        int even_count=0;
        int odd_count=0;

        // count of even and odd numbers
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                even_count+=1;
            }
            else{
                odd_count+=1;
            }
        }
        System.out.println("Count of even numbers in the given array: "+even_count);
        System.out.println("Count of odd numbers in the given array: "+odd_count);
    }
    
}
