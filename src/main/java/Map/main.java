package Map;

import org.hibernate.type.format.jaxb.JaxbXmlFormatMapper;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("Anuj", "CS", 50000),
                new Employee("Aakash", "IT", 70000),
                new Employee("Vishnu", "CS", 480000),
                new Employee("Vivek", "IT", 90000));

        Map<String, List<Employee>> depts = employees.stream().
                                                collect(Collectors.groupingBy(e -> e.getDepartment()));

        System.out.println(depts);


    }
}
