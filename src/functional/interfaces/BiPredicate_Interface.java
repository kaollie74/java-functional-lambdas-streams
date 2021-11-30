package functional.interfaces;

import java.util.function.BiPredicate;

public class BiPredicate_Interface {

  /* Notes:
   *       1. 2 inputs & the Output would be Boolean
   * */
  public static void main(String[] args) {

    BiPredicate<Integer, String> biPredicate = (number, str) -> {
      return number < 10 && str.length() > 5;
    };

    boolean blah = biPredicate.test(10, "Kyle Olson");
    System.out.println(blah);
  }




}
