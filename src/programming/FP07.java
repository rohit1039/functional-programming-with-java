package programming;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a list of integers, find the maximum value and minimum value element present in it using Stream functions
 */
public class FP07
{
  public static void main(String[] args)
  {
    List<Integer> myList = new ArrayList<>(List.of(10, 15, 8, 49, 25, 98, 98, 32, 15));

    myList.stream().reduce(Integer::max).stream().forEach(System.out::println);

    myList.stream().reduce(Integer::min).stream().forEach(System.out::println);
  }
}
