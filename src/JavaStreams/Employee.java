package JavaStreams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    String name;
    int age;

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("Alice", 30),
                new Employee("bob", 25),
                new Employee("Charlie", 30),
                new Employee("David", 25),
                new Employee("Eve",35));
        //groupby age
        Map<Integer, List<Employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(e -> e.getAge()));
        collect.entrySet().forEach(System.out::println);

        //sort multiple fields
        employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge)
                        .thenComparing(Employee::getName)).forEach(System.out::println);



        employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge)
                        .thenComparing(Employee::getName)).forEach(System.out::println);
    }

}
