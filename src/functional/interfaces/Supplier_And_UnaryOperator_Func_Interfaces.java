package functional.interfaces;

import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Supplier_And_UnaryOperator_Func_Interfaces {

  public static void main(String[] args) {
    /* Notes -> Supplier Interface
     *     1. No Input but return a result
     */
    Supplier<Integer> randomIntegerSupplier =
        () -> {
          Random random_number = new Random();
          // return random number between 0 - 1000.
          return random_number.nextInt(1000);
        };
        System.out.println(randomIntegerSupplier.get());

    /* Notes -> UnaryOperator Interface
     *   1. Takes on parameter as input and returns the result of the same type as the result.
     *   2. example -> UnaryOperator<Integer> unaryOperator = x -> x * 3
     * */
    UnaryOperator<Integer> unaryOperator = x -> x * 3;
    System.out.println(unaryOperator.apply(5)); // OUTPUT: 15
  } // end void main
} // end class Supplier_And_UnaryOperator_Func_Interfaces
