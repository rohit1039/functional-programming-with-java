package programming;

import java.util.ArrayList;
import java.util.List;

/**
 * @author - Rohit Parida
 */
public class FP01
{
  public static void main(String[] args)
  {
    List<Integer> list = new ArrayList<>(List.of(45, 65, 78, 96));

    list.stream()
        .filter(number -> !(number % 2 == 0)) // lambda expression to print odd numbers
        .map(n -> n * n * n) // cubes of each numbers
        .forEach(System.out::println); // method reference

    List<String> courses = new ArrayList<>
        (List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "Spring MVC", "Azure", "Docker"));
    courses.forEach(System.out::println); // list of courses

    courses.stream().map(course -> course + "->" + course.length()).forEach(System.out::println); // length of each course

    courses.stream().filter(c -> c.contains("Spring")).forEach(System.out::println); // printing courses that contains "Spring"

    courses.stream().filter(course -> course.length() == 3).forEach(System.out::println); // printing courses whose length is 3

    courses.stream().filter(course -> course.length() >= 4).map(course->course+"->"+course.length()).forEach(System.out::println);
  }
}
