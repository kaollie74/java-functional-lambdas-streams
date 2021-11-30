package functional.interfaces;

import java.util.function.BiFunction;

public class BiFunction_Interface_Example {
  /*
   * Notes -> BiFunction Interface
   *   1. BiFunction can be any type
   * */
  public static void main(String[] args) {

    /* Notes:
     *   1. First param <Integer> -> expected type Integer to be passed in
     *   2. 2nd param <String> -> expected type String to be passed in
     *   3. 3rd param <String> -> expected output String to come from function. This can be any type
     * */
    BiFunction<Integer, String, String> biFunction =
        (num, str) -> {
            return num + " " + str;
        };

    String value = biFunction.apply(6, "Kyle Olson");
    System.out.println(value); // OUTPUT: 6 Kyle Olson
  } // end void main
} // end BiFunction_Interface_Example
