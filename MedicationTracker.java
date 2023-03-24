/*
 * This code uses the Scanner class to prompt the user for their medication information and daily questions.
 * The while loop repeatedly asks the user if they took 
 * their medication today until they provide a valid input of "yes" or "no". 
 */
package healthappsc;

/**
 *
 * @author Halle Vu
 */
public class MedicationTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for medication information
        System.out.println("Please enter your medication information:");
        System.out.print("Name: ");
        String medicationName = scanner.nextLine();
        System.out.print("Dosage: ");
        String medicationDosage = scanner.nextLine();
        System.out.print("Frequency (e.g. 2 times a day): ");
        String medicationFrequency = scanner.nextLine();

        // Ask daily questions
        boolean tookMedicationToday = false;
        while (true) {
            System.out.println("Did you take " + medicationName + " today? (yes or no)");
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("yes")) {
                tookMedicationToday = true;
                break;
            } else if (input.equals("no")) {
                tookMedicationToday = false;
                break;
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }

        // Output results
        System.out.println("Medication Information:");
        System.out.println("Name: " + medicationName);
        System.out.println("Dosage: " + medicationDosage);
        System.out.println("Frequency: " + medicationFrequency);
        System.out.println("Took medication today? " + (tookMedicationToday ? "Yes" : "No"));
    }
}
