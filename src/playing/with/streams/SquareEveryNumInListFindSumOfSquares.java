package playing.with.streams;

import java.util.List;

public class SquareEveryNumInListFindSumOfSquares {
  /* TODO: Square every number in a list and find the sum of squares
          1. Square numbers in list
          2. Find the sum of all the squared numbers
  * */

  public static void main(String[] args) {
    List<Integer> numbers_list = List.of(1, 3, 4);
    int sum_of_squared_nums =
        numbers_list.stream().map(num -> num * num).reduce(0, Integer::sum);
    System.out.println(sum_of_squared_nums);
  }
}
