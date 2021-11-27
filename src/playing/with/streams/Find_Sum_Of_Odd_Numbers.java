package playing.with.streams;

import java.util.List;

public class Find_Sum_Of_Odd_Numbers {

  /* TODO: Find Sum of Odd Number in a list
          1. filter -> num % 2 != 0
          2. calculate total of odd numbers
  * */
  public static void main(String[] args) {
    List<Integer> numbers = List.of(3, 6, 8, 9);
    int sum_of_odd_numbers = numbers.stream().filter(x -> x % 2 == 1).reduce(0, Integer::sum);
    System.out.println("Sum Of Odd Numbers: " + sum_of_odd_numbers); // OUTPUT: 12
  } // end void main
} // class Find_Sum_Of_Odd_Numbers
