package function.programming.with.custom.classes;

public class Course {
    // Fields
    private String name;
    private String category;
    private int reviewScore;
    private int num_of_students;

    // Constructor
    public Course(String name, String category, int reviewScore, int num_of_students) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.num_of_students = num_of_students;
    }

    // getter & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNum_of_students() {
        return num_of_students;
    }

    public void setNum_of_students(int num_of_students) {
        this.num_of_students = num_of_students;
    }

    // toString
    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", reviewScore=" + reviewScore +
                ", num_of_students=" + num_of_students +
                '}';
    }


}
