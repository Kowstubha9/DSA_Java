package Array_programs;

public class averageOfElements {
    public static void main(String[] args) {
        int []a={10,20,30,40,50};
        int sum=0;
        
        // Average of all elements
        for (int i=0;i<a.length;i++){
            sum+=a[i];
        }
        int avg=sum/a.length;
        System.out.println("Average of all elemetns: "+avg);
    }
}
