package programming;

import java.util.List;

public class PrintCoursesContainingSpring {

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

    print_courses_containing_spring(course_list);
  }

  private static void print_courses_containing_spring(List<String> course_list) {
    course_list.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
  }
}
