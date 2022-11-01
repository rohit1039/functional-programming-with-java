package programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Find duplicate elements in descending order in the list
 */
public class FP09
{
  public static void main(String[] args)
  {
    List<Integer> myList = new ArrayList<>(List.of(10, 15, 8, 49, 25, 98, 98, 32, 15));

    myList.stream().filter(n -> Collections.frequency(myList, n) > 1) // elements with frequency > 1
        .distinct().sorted(Comparator.reverseOrder()) // in descending order
        .forEach(System.out::println);
  }
}
