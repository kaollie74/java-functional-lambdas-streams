package programming;

import java.util.List;

public class PrintCubeOfOddNumbers {
  public static void main(String[] args) {
    List<Integer> numbers_list = List.of(1, 9, 2, 8, 3, 7, 4, 6, 5);

    print_cube_of_odd_number(numbers_list);
  }

  private static void print_cube_of_odd_number(List<Integer> numbers) {
    numbers.stream().filter(num -> num % 2 == 1).map(num -> num * num * num).forEach(System.out::println);
  }
}
