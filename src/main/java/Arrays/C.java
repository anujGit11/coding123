package Arrays;

public class C { //How to sort an Array...

    public static void main(String[] args) {
        int[] x = {38,23,32,14,7};
        int temp;

        for (int i = 0; i <x.length ; i++) {

            for (int j = i+1; j < x.length ; j++) {

                if(x[i]>x[j]){

                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;

                }
            }
        }

        for(int z: x){

            System.out.print(z+" ");

        }

        System.out.print("Minimum value: " +x[0]);
        System.out.print("Maximum value: "+ x[x.length-1]);

    }
}
