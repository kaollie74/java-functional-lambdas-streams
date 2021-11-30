package function.programming.with.custom.classes;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP04_Custom_Class {

  public static void main(String[] args) {
    /* Notes:
     *   1. Create a List of course with Course class.
     * */
    var course_list =
        List.of(
            new Course("Spring", "Framework", 98, 20_000),
            new Course("Spring Boot", "Framework", 95, 18_000),
            new Course("API", "Framework", 97, 20_000),
            new Course("Microservices", "Microservices", 98, 25_000),
            new Course("Fullstack", "FullStack", 91, 14_000),
            new Course("AWS", "Cloud", 92, 21_000),
            new Course("Azure", "Cloud", 99, 21_000),
            new Course("Docker", "Cloud", 92, 20_000),
            new Course("Kubernetes", "Cloud", 91, 20_000));

    // Creating Custom Predicate conditions
    Predicate<Course> review_score_greater_than_90_predicate = el -> el.getReviewScore() > 90;
    Predicate<Course> review_score_greater_than_95_predicate = el -> el.getReviewScore() > 95;
    Predicate<Course> review_score_less_than_90_predicate = el -> el.getReviewScore() > 90;

    // allMatch
    System.out.println(
        "ALL Match -> review_score_greater_than_90_predicate"
            + course_list.stream()
                .allMatch(review_score_greater_than_90_predicate)); // OUTPUT: True
    System.out.println(
        "ALL Match -> review_score_greater_than_95_predicate"
            + course_list.stream()
                .allMatch(review_score_greater_than_95_predicate)); // OUTPUT: False

    // noneMatch
    System.out.println(
        "NONE Match -> review_score_less_than_90_predicate"
            + course_list.stream()
                .noneMatch(review_score_greater_than_90_predicate)); // OUTPUT: False
    System.out.println(
        "NONE Match -> review_score_greater_than_95_predicate"
            + course_list.stream()
                .noneMatch(review_score_greater_than_95_predicate)); // OUTPUT: False
    System.out.println(
        "NONE Match -> review_score_less_than_90_predicate"
            + course_list.stream().noneMatch(review_score_less_than_90_predicate)); // OUTPUT: True
    // anyMatch
    System.out.println(
        "ANY Match -> review_score_greater_than_90_predicate"
            + course_list.stream()
                .anyMatch(review_score_greater_than_90_predicate)); // OUTPUT: False
    System.out.println(
        "ANY Match -> review_score_greater_than_95_predicate"
            + course_list.stream()
                .anyMatch(review_score_greater_than_95_predicate)); // OUTPUT: False
  } // end void main
} // class FP04_Custom_Class
