package playing.with.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomSortedWithLambdas {

  public static void main(String[] args) {
    List<String> course_list =
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

    // Notes:
    //  1. stream -> course_list
    //  2. sorted -> compare the length of each string -> use "Comparator.comparing()" to do this.
    List<String> sorted_course_list =
        course_list.stream()
            .sorted(Comparator.comparing(String::length))
            .collect(Collectors.toList());

    // OUTPUT: [API, AWS, PCF, Azure, Spring, Docker, Kubernetes, Spring Boot, Microservices]
    System.out.println("Sorted Course List based on Length of String: " + sorted_course_list);

    // Notes:
    //  1. stream -> course_list
    //  2. sorted -> compare the length of each string -> use "Comparator.comparing(String::length)" to do this.
    //  3. reverse -> once compared we will reverse the order -> Expected result: longest to shortest.
    List<String> sorted_course_list_reverse_order =
        course_list.stream()
            .sorted(Comparator.comparing(String::length).reversed())
            .collect(Collectors.toList());

    // OUTPUT: [Microservices, Spring Boot, Kubernetes, Spring, Docker, Azure, API, AWS, PCF]
    System.out.println("Sort by length of string and put in reverse order: " + sorted_course_list_reverse_order);

  }
}
