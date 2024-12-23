package Arrays;

public class D { //Find maximum array...

    public static void main(String[] args) {
        int[] a = {67,54,26,90,48,76};
        int max = a[0];

        for (int i = 1; i < a.length ; i++) {
            if(max< a[i]){
                max = a[i];
            }
        }

        System.out.println("Maximum value : " +max);
    }
}
