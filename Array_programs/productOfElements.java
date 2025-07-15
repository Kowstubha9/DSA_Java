package Array_programs;

public class productOfElements {
    public static void main(String[] args) {
        int []a={10,20,30,40,50};
        int product=1;
        // sum of all elements
        for (int i=0;i<a.length;i++){
            product*=a[i];
        }
        System.out.println("Sum of all elemetns: "+product);
    }
}
