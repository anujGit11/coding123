package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElementsFinder {

    public static void main(String[] args) {

        int[] array1 = {10,12,14,16,18,20};
        int[] array2 = {11,13,14,15,17,20};

        Set<Integer> commonNumbers = new HashSet<>();

        for (int i: array1){
            for (int j: array2){

                if(i == j){
                    commonNumbers.add(i);
                }
            }
        }


        System.out.println(commonNumbers);

    }
}
