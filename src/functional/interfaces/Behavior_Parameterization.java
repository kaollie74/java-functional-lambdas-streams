package functional.interfaces;

import java.util.List;
import java.util.function.Predicate;

public class Behavior_Parameterization {

  //  @SuppressWarnings("unused")
  public static void main(String[] args) {
    List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

    // Notes: EVEN -> Example of Behavior Parameterization -> passing in the logic as an argument
    //  1. First argument is our numbers List
    //  2. Second argument we our leveraging the Predicate Interface and passing in our condition.
    filterAndPrint(numbers, x1 -> x1 % 2 == 0);

    // Notes: ODD -> -> Example of Behavior Parameterization -> passing in the logic as an argument
    //  1. First argument is our numbers List
    //  2. Second argument we our leveraging the Predicate Interface and passing in our condition.
    filterAndPrint(numbers, x -> x % 2 != 0);
  }

  private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
    numbers.stream().filter(predicate).forEach(System.out::println);
  }
}
