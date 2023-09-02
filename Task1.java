package CodeSoft;
        //Ankit kumar (ID:CS07WX33008)
        //Batch: 10th aug 2023- 10th sep 2023
        // task-1 [STUDENT GRADE CALCULATOR] {Codesoft}


import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the number of subjects
        System.out.println("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        // Create an array to store the marks of each subject
        int[] marks = new int[numberOfSubjects];

        // Get the marks of each subject
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.println("Enter the marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Calculate the total marks
        int totalMarks = 0;
        for (int i = 0; i < numberOfSubjects; i++) {
            totalMarks += marks[i];
        }

        // Calculate the average percentage
        float averagePercentage = (totalMarks / numberOfSubjects ) ;

        // Grade calculation
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else {
            grade = "D";
        }

        // Display the results
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}

