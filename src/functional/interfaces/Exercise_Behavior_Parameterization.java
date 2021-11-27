package functional.interfaces;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise_Behavior_Parameterization {
  // TODO: List squaredNumbers - numbers.stream().map(x -> x*x).collect(Collectors.toList());
  public static void main(String[] args) {
    List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

    // NOTES: Squared Numbers
    var squared_numbers_list = mapAndCreateNewList(numbers, x -> x * x );
    System.out.println("New Squared List:\n" + squared_numbers_list);


    var cubed_numbers_list = mapAndCreateNewList(numbers, x -> x * x * x );
    System.out.println("New Squared List:\n" + cubed_numbers_list);

  } // end void main


  private static List<Integer> mapAndCreateNewList(List<Integer> nums, Function<Integer, Integer> mappingFunction){
    /* Notes:
    *   1. stream() numbers list
    *   2. pass in mappingFunction (a.k.a logic) to .map()
    *   3. Run collect(Collectors.toList()) to convert to a new list
    *   4. return List
    *
    */
    return nums.stream().map(mappingFunction).collect(Collectors.toList());
  }
}
