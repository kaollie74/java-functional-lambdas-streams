package function.programming.with.custom.classes;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_Course_Comparator {

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

    // Custom Comparator
    // Notes:
    //  1. Using "comparingInt()" instead of "comparing()" is more efficient since we avoid boxing
    //     and unboxing situations.
    Comparator<Course> comparing_by_num_of_students_increasing =
        Comparator.comparingInt(Course::getNum_of_students);

    // Sort by num of students
    var sorted_students =
        course_list.stream()
            .sorted(comparing_by_num_of_students_increasing)
            .collect(Collectors.toList());

    // Print List out
    //    System.out.println(sorted_students);

    // Custom Comparator
    Comparator<Course> comparing_by_num_of_students_decreasing =
        Comparator.comparingInt(Course::getNum_of_students).reversed();

    // Sort by num of students Reverse
    var sorted_reverse =
        course_list.stream()
            .sorted(comparing_by_num_of_students_increasing)
            .collect(Collectors.toList());
    // Print List out
    //    System.out.println(sorted_reverse);

    // Comparing Number of Students And Num of Reviews
    Comparator<Course> comparing_by_num_of_students_and_num_of_reviews =
        Comparator.comparingInt(Course::getNum_of_students)
            .thenComparingInt(Course::getReviewScore);

    System.out.println(
        course_list.stream()
            .sorted(comparing_by_num_of_students_and_num_of_reviews)
            .collect(Collectors.toList())
        // OUTPUT:
        // [Course{name='Fullstack', category='FullStack', reviewScore=91, num_of_students=14000},
        // Course{name='Spring Boot', category='Framework', reviewScore=95, num_of_students=18000},
        // Course{name='Kubernetes', category='Cloud', reviewScore=91, num_of_students=20000},
        // Course{name='Docker', category='Cloud', reviewScore=92, num_of_students=20000},
        // Course{name='API', category='Framework', reviewScore=97, num_of_students=20000},
        // Course{name='Spring', category='Framework', reviewScore=98, num_of_students=20000},
        // Course{name='AWS', category='Cloud', reviewScore=92, num_of_students=21000},
        // Course{name='Azure', category='Cloud', reviewScore=99, num_of_students=21000},
        // Course{name='Microservices', category='Microservices', reviewScore=98,
        // num_of_students=25000}]

        );
  } // end void main
} // end class Sort_Course_Comparator
