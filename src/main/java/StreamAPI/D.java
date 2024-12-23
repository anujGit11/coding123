package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Get Second Highest/Lowest Number using Streams
public class D {

    public static void main(String[] args) {


          //For 2nd highest...
//        List<Integer> list = Arrays.asList(19, 34, 52, 16, 78, 84, 32, 45, 40, 78, 84,79);
//        Integer i = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
//        System.out.println(i);

        //For 2nd lowest...
        List<Integer> list = Arrays.asList(19, 34, 52, 16, 78, 84, 32, 45, 40, 78, 84, 79);
        Integer i = list.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println(i);
    }
}
