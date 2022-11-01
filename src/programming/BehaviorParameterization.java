package programming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Passing Predicate to another Method
 */
public class BehaviorParameterization
{
  public static void main(String[] args)
  {
    List<Integer> sum = new ArrayList<>(List.of(45, 25, 36, 15, 58));

    Predicate<Integer> evenPredicate = x -> x % 2 == 0; // filter()
    extracted(sum, evenPredicate);

    Predicate<Integer> oddPredicate = x -> x % 2 != 0; // filter()
    extracted(sum, oddPredicate);
  }

  private static void extracted(List<Integer> sum, Predicate<Integer> predicate)
  {
    sum.stream().filter(predicate).forEach(System.out::println);
  }
}
