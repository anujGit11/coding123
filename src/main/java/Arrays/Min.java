package Arrays;

public class Min { //Find minimum array...

    public static void main(String[] args) {
        int[] a = {67, 54, 26, 90, 48, 76};
        int min = a[0];

        for (int i = 1; i < a.length ; i++) {
            if(min > a[i]){
                min = a[i];
            }

        }

        System.out.println("Minimum Value : "+ min);

    }
}
