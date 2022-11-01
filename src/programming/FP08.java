package programming;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a list of integers, find the total number of elements and first element present in the list using Stream functions
 */
public class FP08
{
  public static void main(String[] args)
  {
    List<Integer> myList = new ArrayList<>(List.of(10, 15, 8, 49, 25, 98, 98, 32, 15));

    System.out.println(myList.stream().count()); // total number of elements in the list

    myList.stream().findFirst().ifPresent(System.out::println); // first element in the list
  }
}
