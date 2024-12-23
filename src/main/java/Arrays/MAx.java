package Arrays;

public class MAx {

    public static void main(String[] args) {

        int[] a = {86,56,61,79,99,10};
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if(max<a[i]){
                max = a[i];
            }
        }

        System.out.println("MAXIMUM VALUE : "+ max);

    }

}
