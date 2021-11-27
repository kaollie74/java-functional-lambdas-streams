package programming;

import java.util.List;

public class ExercisePrintOnlyOddNumbers {
  public static void main(String[] args) {
    List<Integer> nums_list = List.of(1, 9, 2, 8, 3, 7, 4, 6, 5);
    printOnlyOdds(nums_list);
  }

  private static void printOnlyOdds(List<Integer> numbers) {
    // 1. convert "numbers" list into "stream"
    // 2. filter and only return odds
    // 3. forEach and print value out
    numbers.stream().filter(num -> num % 2 != 0).forEach(System.out::println);
  }


}
