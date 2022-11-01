package programming;

import java.util.ArrayList;
import java.util.List;

/**
 * Sum of all numbers present inside the list.
 */
public class FP02
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>(List.of(45, 65, 78, 96));

        int sum = listAddAllNumbers(list);

        int add = listAddAllNumbersUsingFunctionalProgramming(list);

        int square_sum = squareEachNumberAndFindTheSum(list);

        //System.out.println(square_sum);

        //System.out.println(sum);

        System.out.println("Using functional programming " + add);
    }

    /**
     *
     * @param list
     * @return
     */
    private static int squareEachNumberAndFindTheSum(List<Integer> list)
    {
        return list.stream().map(n -> n * n).reduce(0, Integer::sum);
    }

    /**
     * @param list
     * @return
     */
    private static int listAddAllNumbers(List<Integer> list)
    {
        int sum = 0;
        for (int values : list)
        {
            sum += values;
        }
        return sum;
    }

    /**
     * Using Functional Programming
     */
    private static int listAddAllNumbersUsingFunctionalProgramming(List<Integer> list)
    {
        return list.stream().reduce(0, Integer::sum); // initially sum=0, so identity=0
    }
}
