package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//java program to find the max & min value element present in given stream?
public class C {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(11, 32, 45, 67, 89, 92, 31, 67, 34);

        //For Maximum
        Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Maximum value : "+max);

        //For MINIMUM
        Integer min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Minimum value : "+min);

    }
}
