import java.util.Scanner; 
public class StudentGradeCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Number of subjects
        int numSubjects = 5; // You can change this number based on how many subjects are there
        
        // Array to store the marks obtained in each subject
        int[] marks = new int[numSubjects];
        
        // Variable to store the total marks
        int totalMarks = 0;
        
        // Taking input for marks in each subject
        System.out.println("Enter marks obtained (out of 100) in " + numSubjects + " subjects:");
        
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i]; // Add the marks to the total
        }
        
        // Calculate average percentage
        double averagePercentage = (totalMarks / (double)(numSubjects * 100)) * 100;
        
        // Determine the grade based on the average percentage
        String grade = "";
        
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F"; // Failed
        }
        
        // Display the results
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + totalMarks + " out of " + (numSubjects * 100));
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        
        // Close the scanner
        scanner.close();
    }
}
