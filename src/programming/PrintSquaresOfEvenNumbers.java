package programming;

import java.util.List;

public class PrintSquaresOfEvenNumbers {
  public static void main(String[] args) {
    List<Integer> numbers_list = List.of(1, 9, 2, 8, 3, 7, 4, 6, 5);

    print_squares_of_even_numbers(numbers_list);
  }

  private static void print_squares_of_even_numbers(List<Integer> numbers) {
    /* TODO:
     *    1. stream -> list of numbers.
     *    2. filter -> and return only even numbers.
     *    3. map -> and square number (num * num).
     *    4. forEach -> print each squared number out.
     *
     *
     * */
    numbers.stream().filter(num -> num % 2 == 0).map(num -> num * num).forEach(System.out::println);
  }
}
