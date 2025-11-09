package JavaStreams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    String name;
    int age;

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Alice", 22),
                new Student("bob", 25),
                new Student("Charlie", 20),
                new Student("David", 23));

        //Average age of students






        OptionalDouble average = students.stream()
                .mapToInt(Student::getAge)
                .average();
        System.out.println("average is " + average.getAsDouble());
        Double collect = students.stream()
                .collect(Collectors.averagingInt(Student::getAge));
        System.out.println("collect is " + collect);
    }

}
