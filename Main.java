public class Main {
    public static void main(String[] args) {
        int currentYear = 2024;

        // Test valid patient
        /*Patient validPt = new Patient(1001, "John Doe", 1978, 175.5, 78.0);
        validPt.displayDetails(currentYear);

        // Test invalid patient
        Patient invalidPt = new Patient(1002, "Joe Dohn", 1990, -160.0, -65.0);
        invalidPt.displayDetails(currentYear);*/

        Patient patient = new Patient(1001, "John Doe", 1978, 175.5, 78.0, "A", "123-456-7890");
        System.out.printf("Patient BMI: %.2f%n", patient.getBMI());
    }
}
