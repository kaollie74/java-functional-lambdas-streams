package playing.with.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Distinct_Sorted_Methods {

  public static void main(String[] args) {
    /* NOTES:
     *   you can use distinct() & sorted() on streams
     * */
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

    // NOTES:
    //  1.) we will get the "distinct()" values
    //  2.) sort on them
    //  3.) use the "collect(Collectors.toList()" to close the stream and convert back to list.
    List<String> sorted_distinct_courses =
        course_list.stream().distinct().sorted().collect(Collectors.toList());
    System.out.println("Sorted Distinct Courses" + sorted_distinct_courses);
    // OUTPUT: [API, AWS, Azure, Docker, Kubernetes, Microservices, PCF, Spring, Spring Boot]
  } // end void main
}
