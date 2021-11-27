package programming;

import java.util.List;

public class PrintNumberOfCharsForEachCourse {

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

    print_num_chars_for_each_course(course_list);

  }

  private static void print_num_chars_for_each_course(List<String> courses) {

    courses.stream().map(course -> course + " length is: " + course.length()).forEach(System.out::println);
  }
}
