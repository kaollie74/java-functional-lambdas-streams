package playing.with.streams;

import java.util.List;

public class StreamCalculateSum {

  public static void main(String[] args) {
    // List of Numbers
    List<Integer> numbers_list = List.of(1, 9, 2, 8, 3, 7, 4, 6, 5);

    // calculate the sum of numbers
    int sum = addListFunctional(numbers_list);
    System.out.println("SUM -> " + sum);
  }

  private static int addListFunctional(List<Integer> numbers_list) {
    /* TODO:
     *   1. stream -> numbers
     *   2. reduce -> add them up to total
     *     A. 0 to tell where to start the count
     *     B. add "a" * "b" together
     *
     * Example under the hood:
     * Start of List
     *  0 + 1 = 1
     *  1 + 9 = 10
     *  10 + 2 = 12
     *  12 + 8 = 20
     *  20 + 3 = 23
     *  23 + 7 = 30
     *  30 + 4 = 34
     *  34 + 6 = 40
     *  40 + 5 = 45
     *
     * END OF LIST
     *
     * */
    return numbers_list.stream().reduce(0, Integer::sum);
    // This is the same thing with the above implementation
    // return numbers_list.stream().reduce(0, (a, b) -> a + b);

  }
}
