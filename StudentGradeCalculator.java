import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT GRADE CALCULATOR =====");

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        int total = 0;
        String[] subjects = {"Java", "DBMS", "Operating Systems",
                             "Mathematics", "Computer Networks"};

        for (String subject : subjects) {
            System.out.print("Enter marks in " + subject + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        double percentage = total / 5.0;
        String grade;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "F";

        System.out.println("\n===== RESULT =====");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total + "/500");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
