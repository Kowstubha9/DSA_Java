package Array_programs;

public class maximumElement {
    public static void main(String[] args) {
        int []a={10,20,30,40,50};

        // maximum element
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Maximum element: "+max);
    }
}
