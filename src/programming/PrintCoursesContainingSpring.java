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
    /* TODO:
     *  1. convert "course_list" to a stream
     *  2. filter on courses that contain "Spring" in them.
     *  3. Print each course out with forEach
     *
     * */
    course_list.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
  }
}
