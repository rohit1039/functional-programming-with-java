package programming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Behavior Parameterization with Function
 */
public class BehaviorParameterizationExercise
{
  public static void main(String[] args)
  {
    List<Integer> numbers = new ArrayList<>(List.of(45, 25, 36, 15, 58));

    Function<Integer, Integer> integerIntegerFunction = n -> n * n;
//  List<Integer> squaredNumbers = numbers.stream().map(integerIntegerFunction).collect(Collectors.toList());
    System.out.println(getCollect(numbers, integerIntegerFunction));
    /**
     OR
     getCollect(numbers,n->n*n);
     */
  }

  private static List<Integer> getCollect(List<Integer> numbers, Function<Integer, Integer> integerIntegerFunction)
  {
    return numbers.stream().map(integerIntegerFunction).collect(Collectors.toList());
  }
}
