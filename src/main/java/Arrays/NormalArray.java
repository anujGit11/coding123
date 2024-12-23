package Arrays;

public class NormalArray {

    public static void main(String[] args) {
        int[] age = new int[6];

        age[0] = 34;
        age[1] = 35;
        age[2] = 36;
        age[3] = 37;
        age[4] = 38;
        age[5] = 39;

//        for (int i = 0; i < age.length; i++) {
//            System.out.println(age[i]);
//        }

        for(int i : age){
            System.out.println(i);
        }

    }

}
