import java.util.Scanner;

public class StudentGradeCalculator {
    // reads 3 scores and shows average + letter grade
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three exam scores (0-100).");

        System.out.print("Score 1: ");
        double s1 = input.nextDouble();

        System.out.print("Score 2: ");
        double s2 = input.nextDouble();

        System.out.print("Score 3: ");
        double s3 = input.nextDouble();

        // average
        double avg = (s1 + s2 + s3) / 3.0;

        // letter grade
        char grade;
        if (avg >= 90) grade = 'A';
        else if (avg >= 80) grade = 'B';
        else if (avg >= 70) grade = 'C';
        else if (avg >= 60) grade = 'D';
        else grade = 'F';

        System.out.printf("Average: %.2f%n", avg);
        System.out.println("Letter grade: " + grade);

        input.close();
    }
}
