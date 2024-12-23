package Arrays;

public class B {

    // to remove duplicate elements from an array

    public static void main(String[] args) {
        int[] a = {1,2,2,3,4,4,5,6,6};
        int[] temp = new int[a.length];
        int j=0;

        for (int i = 0; i < a.length-1; i++) {
            if(a[i]!= a[i+1]){
                temp[j] = a[i]  ;
                j++;
            }
        }

        //to copy the last value
        temp[j] = a[a.length-1];
        for(int z: temp){
            System.out.println(z);
        }

    }


}
