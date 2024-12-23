package StreamAPI;

import java.text.Collator;
import java.util.*;

public class maxMin {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(31, 87, 54, 90, 89, 43, 54, 22, 21, 90, 54, 79, 93, 87, 67, 89);

        //For maximum value
        Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Maximum value : "+max);

        //For minimum value...
        Integer min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Minimum value : "+min);


        //For 2nd highest value...
        Integer secondHighest = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println("2nd highest value : "+secondHighest);

        //For 2nd lowest value...
        Integer secondLowest = list.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println("2nd lowest value : "+secondLowest);

    }
}
