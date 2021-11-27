package playing.with.streams;

import java.util.List;

public class Cube_Nums_List_Find_Sum_Of_Cubes {

    /* TODO: Cube every number in a list and find the sum of cubes
          1. Cube ever number in list
          2. calculate sum of the entire list
  * */

  public static void main(String[] args) {
    List<Integer> numbers = List.of(3, 6, 8, 9);
    int sum_of_cube_nums = numbers.stream().map(number -> number * number).reduce(0, Integer::sum);
    System.out.println("Sum Of Cubed Numbers: " + sum_of_cube_nums);
  }
}
