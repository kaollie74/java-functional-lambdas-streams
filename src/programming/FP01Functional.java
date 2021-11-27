package programming;

import java.util.List;

public class FP01Functional {

  public static void main(String[] args) {
    List<Integer> numbers_list = List.of(1, 9, 2, 8, 3, 7, 4, 6, 5);
    //    printAllNumbersInListFunctional(numbers_list);
    printEvenNumsFunc(numbers_list);
  } // end void main

  private static void printAllNumbersInListFunctional(List<Integer> numbers) {

    // What to do for Functional
    // convert to a "stream of elements
    // pass in method reference -> FP01Functional::print
    numbers.forEach(System.out::println);
  }

  private static void printEvenNumsFunc(List<Integer> num) {
    // 1. convert to a stream
    // 2. filter for only even numbers using lambda expression
    // 3. foreach and print element(s) out
    num.stream()
            .filter(number -> number % 2 == 0)
            .forEach(System.out::println);
  }
} // end FP01Structured
