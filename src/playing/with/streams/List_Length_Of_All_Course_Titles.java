package playing.with.streams;

import java.util.List;
import java.util.stream.Collectors;

public class List_Length_Of_All_Course_Titles {

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

    List<String> length_of_all_courses =
        course_list.stream()
            .map(course -> course + " length: " + course.length())
            .collect(Collectors.toList());

    // OUTPUT: [Spring length: 6, Spring Boot length: 11, API length: 3, Microservices length: 13,
    //         AWS length: 3, PCF length: 3, Azure length: 5, Docker length: 6, Kubernetes length:
    //         10]
    System.out.println("Length of all the Courses: " + length_of_all_courses);
  }
}
