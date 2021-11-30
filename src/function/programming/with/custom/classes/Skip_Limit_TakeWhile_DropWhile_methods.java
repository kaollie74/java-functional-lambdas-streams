package function.programming.with.custom.classes;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Skip_Limit_TakeWhile_DropWhile_methods {
  public static void main(String[] args) {
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

    // Comparing Number of Students And Num of Reviews
    Comparator<Course> comparing_by_num_of_students_and_num_of_reviews =
        Comparator.comparingInt(Course::getNum_of_students)
            .thenComparingInt(Course::getReviewScore);

    // Example LIMIT
    System.out.println(
        course_list.stream()
            .sorted(comparing_by_num_of_students_and_num_of_reviews)
            .limit(5) // only have the first 5 based on Comparator
            .collect(Collectors.toList()));
    // OUTPUT >>>
    // 1. [Course{name='Fullstack', category='FullStack', reviewScore=91, num_of_students=14000},
    // 2. Course{name='Spring Boot', category='Framework', reviewScore=95, num_of_students=18000},
    // 3. Course{name='Kubernetes', category='Cloud', reviewScore=91, num_of_students=20000},
    // 4. Course{name='Docker', category='Cloud', reviewScore=92, num_of_students=20000},
    // 5. Course{name='API', category='Framework', reviewScore=97, num_of_students=20000}]

    // Example SKIP
    System.out.println(
        course_list.stream()
            .sorted(comparing_by_num_of_students_and_num_of_reviews)
            .skip(3) // the first 3 courses will not be in the list.
            .collect(Collectors.toList()));

    // Example Take While
    // Notes:
    //  var numsList = [1, 2, 3]
    //  takeWhile will return el's until condition is met
    //  for example, if I do on "numsList" list.stream().takeWhile(el -> el < 2) -> output would be
    //  [1].
    //  so order of the list is important if I do on "numsList" list.stream().takeWhile(el -> el <
    //  1) -> output would be [] -> this is because the first

    var nums = List.of(1, 4, 2);
    var nums2 = nums.stream().takeWhile(el -> el < 3).collect(Collectors.toList());
    System.out.println("NUMS 2: " + nums2); // OUTPUT: [1]

    // dropWhile() // do later section 29 6:00 minute mark "Learn Java Functional Programming with
    // Lambdas & Streams"
  } // end void main
} // end Skip_Limit_TakeWhile_DropWhile_methods
