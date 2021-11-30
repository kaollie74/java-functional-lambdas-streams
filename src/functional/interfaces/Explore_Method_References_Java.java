package functional.interfaces;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Explore_Method_References_Java {
  public static void main(String[] args) {

    // method reference CLASS::method_in_class
    // Example el -> el.toUpperCase() is same as String::toUpperCase
    // String is the wrapper class and toUpperCase is a method that exists inside String class

    List<String> courses =
        List.of(
            "Spring",
            "Spring Boot",
            "API",
            "Microservices",
            "AWS",
            "PCF",
            "Azure",
            "Docker",
            "Kubernetes");

    var upper_case_courses = courses.stream().map(String::toUpperCase).collect(Collectors.toList());
    System.out.println(upper_case_courses);




    // Constructor reference -> "String::new" same as "new String()";
    Supplier<String> supplier = String::new;
  } // end void main
} // end Explore_Method_References_Java
