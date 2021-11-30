package functional.interfaces;

import java.util.function.BiConsumer;

public class BiConsumer_Interface_Example {

  public static void main(String[] args) {
      /* Notes -> BiConsumer Interface
      *     1. Takes 2 inputs -> consumes it -> 0 return
      *     2. The 2 params can be any type
      * */
      BiConsumer<String, String> biConsumer = (s1, s2) ->{
           System.out.println("S1:" + s1);
           System.out.println("S2:" + s2);
      };

      // will biConsumer will print both strings out
      // does not return anything
      biConsumer.accept("Kyle Likes", "Bacon");


  } // end void main
} // end BiConsumer_Interface_Example
