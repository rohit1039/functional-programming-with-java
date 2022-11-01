package programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Given a list of integers, sort all the values present in it in descending order using Stream functions
 */
public class FP06
{
  public static void main(String[] args)
  {
    List<Integer> myList = new ArrayList<>(List.of(10, 15, 8, 49, 25, 98, 98, 32, 15));

    myList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
  }
}
