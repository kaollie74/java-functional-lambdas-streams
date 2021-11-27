package programming;

import java.util.List;

public class PrintCoursesLengthOverFour {

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

    print_course_length_over_four(course_list);
  }

  private static void print_course_length_over_four(List<String> courses) {
    courses.stream().filter(course -> course.length() >= 4 ).forEach(System.out::println);
  }
}
