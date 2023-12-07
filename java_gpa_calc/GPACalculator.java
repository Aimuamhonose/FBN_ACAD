import java.util.ArrayList;
import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>();

        System.out.println("Welcome to GPA Calculator!");

        // Input courses
        while (true) {
            System.out.print("Enter Course Name and Code (or type 'done' to finish): ");
            String courseNameCode = scanner.nextLine().trim();

            if (courseNameCode.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter Course Unit: ");
            int courseUnit = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            System.out.print("Enter Course Score: ");
            int courseScore = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            // Calculate grade and grade unit
            Course course = new Course(courseNameCode, courseUnit, courseScore);
            courses.add(course);
        }

        // Display the result in tabular form
        System.out.println("|----------------------------|-----------------------|------------|---------------------|");
        System.out.println("| COURSE & CODE              | COURSE UNIT           | GRADE      | GRADE-UNIT          |");
        System.out.println("|----------------------------|-----------------------|------------|---------------------|");

        double totalQualityPoint = 0;
        int totalGradeUnit = 0;

        for (Course course : courses) {
            System.out.printf("| %-26s | %-21d | %-10s | %-19d |\n",
                    course.getNameCode(), course.getUnit(), course.getGrade(), course.getGradeUnit());

            totalQualityPoint += course.getGradeUnit();
            totalGradeUnit += course.getUnit();
        }

        System.out.println("|---------------------------------------------------------------------------------------|");

        // Calculate GPA
        double gpa = totalQualityPoint / totalGradeUnit;

        System.out.printf("Your GPA is = %.2f to 2 decimal places.\n", gpa);
    }
}

class Course {
    private String nameCode;
    private int unit;
    private int score;
    private String grade;
    private int gradeUnit;

    public Course(String nameCode, int unit, int score) {
        this.nameCode = nameCode;
        this.unit = unit;
        this.score = score;
        calculateGrade();
        calculateGradeUnit();
    }

    public String getNameCode() {
        return nameCode;
    }

    public int getUnit() {
        return unit;
    }

    public String getGrade() {
        return grade;
    }

    public int getGradeUnit() {
        return gradeUnit;
    }

    private void calculateGrade() {
        if (score >= 70 && score <= 100) {
            grade = "A";
        } else if (score >= 60 && score < 70) {
            grade = "B";
        } else if (score >= 50 && score < 60) {
            grade = "C";
        } else if (score >= 45 && score < 50) {
            grade = "D";
        } else if (score >= 40 && score < 45) {
            grade = "E";
        } else {
            grade = "F";
        }
    }

    private void calculateGradeUnit() {
        switch (grade) {
            case "A":
                gradeUnit = 5;
                break;
            case "B":
                gradeUnit = 4;
                break;
            case "C":
                gradeUnit = 3;
                break;
            case "D":
                gradeUnit = 2;
                break;
            case "E":
                gradeUnit = 1;
                break;
            default:
                gradeUnit = 0;
        }
    }
}
