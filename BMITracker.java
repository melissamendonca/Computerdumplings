package healthappsc;
import java.util.Scanner;
/**
 *
 * @author Halle Vu
 */
public class BMITracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user information
        System.out.println("Please enter your information:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Gender (M/F): ");
        String gender = scanner.next();
        System.out.print("Weight (in kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Height (in cm): ");
        double height = scanner.nextDouble();

        // Calculate BMI
        double heightInMeters = height / 100;
        double bmi = weight / (heightInMeters * heightInMeters);

        // Determine weight status and recommendations
        String weightStatus;
        String recommendations;
        if (gender.equalsIgnoreCase("M")) {
            if (bmi < 18.5) {
                weightStatus = "Underweight";
                recommendations = "You may need to gain weight to achieve a healthy BMI. Consider talking to a doctor or dietitian.";
            } else if (bmi < 25) {
                weightStatus = "Normal weight";
                recommendations = "Congratulations! Your BMI is within a healthy range.";
            } else if (bmi < 30) {
                weightStatus = "Overweight";
                recommendations = "You may need to lose weight to achieve a healthy BMI. Consider talking to a doctor or dietitian.";
            } else {
                weightStatus = "Obese";
                recommendations = "You may need to lose weight to achieve a healthy BMI. Consider talking to a doctor or dietitian.";
            }
        } else if (gender.equalsIgnoreCase("F")) {
            if (bmi < 18.5) {
                weightStatus = "Underweight";
                recommendations = "You may need to gain weight to achieve a healthy BMI. Consider talking to a doctor or dietitian.";
            } else if (bmi < 24) {
                weightStatus = "Normal weight";
                recommendations = "Congratulations! Your BMI is within a healthy range.";
            } else if (bmi < 30) {
                weightStatus = "Overweight";
                recommendations = "You may need to lose weight to achieve a healthy BMI. Consider talking to a doctor or dietitian.";
            } else {
                weightStatus = "Obese";
                recommendations = "You may need to lose weight to achieve a healthy BMI. Consider talking to a doctor or dietitian.";
            }
        } else {
            System.out.println("Invalid gender.");
            return;
        }

        // Output results
        System.out.println("BMI Calculator Results:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " cm");
        System.out.println("BMI: " + bmi);
        System.out.println("Weight Status: " + weightStatus);
        System.out.println("Recommendations: " + recommendations);
    }
}
