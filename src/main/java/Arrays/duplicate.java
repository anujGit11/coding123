package Arrays;

public class duplicate {

    public static void main(String[] args) {

        int[] i = {21,31,31,41,52,64,64};
        int[] dup = new int[i.length];

        int j= 0;

        for(int a=0; a<i.length-1; a++){
            if(i[a]!= i[a+1]){
                dup[j] = i[a];
                j++;
            }
        }
        dup[j] = i[i.length-1];
        for(int z: dup){

            System.out.println(z);
        }



    }

}
