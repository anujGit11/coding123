package Map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class mains {

    public static void main(String[] args) {
        List<EMP> list = Arrays.asList(
                new EMP(1, "Akash", 19000),
                new EMP(2, "Aman", 20000),
                new EMP(3, "Ashish", 21000)

        );

//        EMP emp = list.stream().max((Comparator.comparingInt(EMP::getSalary))).get();
        EMP emp = list.stream().max(Comparator.comparing(EMP::getSalary)).get();
        System.out.println(emp.getSalary());
    }
}
