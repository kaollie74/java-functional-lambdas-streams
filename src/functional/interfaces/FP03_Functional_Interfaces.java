package functional.interfaces;

import java.util.List;
import java.util.function.BinaryOperator;

public class FP03_Functional_Interfaces {

  public static void main(String[] args) {

    List<Integer> numbers_list = List.of(12, 9, 12, 4, 6, 2, 4, 12, 15);

    // NOTES:
    //  This is example of the functional interface that lambdas uses under the hood.
    //  Integer::sum is leveraged with the "BinaryOperator" interface.
    BinaryOperator<Integer> sum1 = Integer::sum;

    /* Notes:
    *   1. We are creating our own "customSumLogic method."
    *   2. We are creating a new BinaryOperator instance
    *   3. @Override the apply method and writing our own custom logic
    *   4. leverage logic in reduce() method.
    *
    * */
    BinaryOperator<Integer> customSumLogic = new BinaryOperator<Integer>() {
      @Override
      public Integer apply(Integer num1, Integer num2) {
        return num1 + num2;
      }
    };

    int sum = numbers_list.stream().reduce(0, customSumLogic);
    System.out.println("Sum: " + sum);
  }
}
