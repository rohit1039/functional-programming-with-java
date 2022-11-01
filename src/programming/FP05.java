package programming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create a list of course titles and find each course's length and create a list of it.
 */
public class FP05
{
  public static void main(String[] args)
  {
    List<String> courses = new ArrayList<>
        (List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "Spring MVC", "Azure", "Docker"));

    System.out.println(findLength(courses));
  }

  private static List<Integer> findLength(List<String> courseList)
  {
    return courseList.stream().map(c -> c.length()).collect(Collectors.toList());
  }
}










