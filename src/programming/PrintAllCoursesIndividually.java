package programming;

import java.util.List;

public class PrintAllCoursesIndividually {

  public static void main(String[] args) {
    List<String> course_list =
        List.of(
            "Sprint",
            "Spring Boot",
            "API",
            "Microservices",
            "AWS",
            "PCF",
            "Azure",
            "Docker",
            "Kubernetes");
    printCourses(course_list);
  }

  private static void printCourses(List<String> courses) {
    /* TODO:
    *  1. print each course out by forEach
    * */
    courses.forEach(System.out::println);
  }
}
