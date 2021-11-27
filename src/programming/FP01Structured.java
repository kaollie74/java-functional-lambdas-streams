package programming;

import java.util.List;

public class FP01Structured {

  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 9, 2, 8, 3, 7, 4, 6, 5);
    printEvenNumbers(numbers);
  } // end void main

//  private static void printAllNumbersInListStructured(List<Integer> numbers) {
//
//    // enhance for loop way
//    for (Integer num : numbers) {
//      System.out.println("EL: " + num);
//    }
//  }

  private static void printEvenNumbers(List<Integer> numbers) {

    // enhance for loop way
    for (Integer num : numbers) {
      if (num % 2 == 0) System.out.println("EL: " + num);
    }
  }
} // end FP01Structured
