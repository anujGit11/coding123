package Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] a = {32,49,16,93,29,67};
        int temp;

        for(int i = 0; i < a.length; i++){

            for (int j = i+1; j < a.length ; j++) {

                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }


        }

        for(int o : a){
            System.out.print(o+" ");
        }


    }
}
