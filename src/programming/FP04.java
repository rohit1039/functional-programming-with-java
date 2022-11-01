package programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Square every number in the list and find the sum of squares
 */
public class FP04
{
  public static void main(String[] args)
  {
    List<Integer> integerElements = new ArrayList<>(List.of(12, 9, 13, 15, 6, 12, 4, 2, 4));

    List<String> names = new ArrayList<>(List.of("Rohit", "Subham", "Suresh", "Abhi", "Ashu", "Sonu", "Rashmi"));

    //System.out.println(squareSum(integerElements));

    sortedDistinct(names);
  }

  private static Integer squareSum(List<Integer> e)
  {
    return e.stream().map(n -> n * n).reduce(0, Integer::sum);
  }

  private static void sortedDistinct(List<String> list)
  {
    list.stream().distinct().sorted(Comparator.comparing(n -> n.length())).forEach(System.out::println);
  }
}
