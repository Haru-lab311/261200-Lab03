public class Patient {
    private int id;        // patient's ID
    private String name;   // patient's full name
    private int birthYear; // patient's year of birth (CE)
    private double height; // patient's height in centimeters
    private double weight; // patient's weight in kilograms
    private String bloodGroup;//patient's blood group
    private String phoneNumber;//patient's phone number

    public Patient(int id, String name, int birthYear,
                   double height, double weight, String bloodGroup, String phoneNumber) {
        // TODO: Initialize fields with validation
        // Consider: What makes a valid birthYear?
        //           What are valid ranges for height and weight?
        this.id = id;
        this.name = name;
        this.bloodGroup = bloodGroup; //Initialize blood group
        this.phoneNumber = phoneNumber;//Initialize phone number
        if(birthYear <= 2025 )
            this.birthYear = birthYear;
        else
            this.birthYear = 2000;
        if(height >= 30 && height <= 250)
            this.height = height;
        else
            this.height = 170;//default height
        if(weight >= 0.5 && weight <= 300)
            this.weight = weight;
        else
            this.weight = 60;//default weight
    }
    // TODO: Implement getters for other fields
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getBirthYear() {
        return this.birthYear;
    }
    public double getHeight() {
        return this. height;
    }
    public double getWeight() {
        return this.weight;
    }
    public String getBloodGroup(){return this.bloodGroup;}//new getter methods for bloodgroup
    public String getPhoneNumber(){return this.phoneNumber;}// new getter methods for phonenumber

    public double getBMI(){
        double heightInmeter = height/100; //change cm to m
        return weight/(heightInmeter*heightInmeter); // calculate BMI;
    }


    public int getAge(int currentYear) {
        if(currentYear >= birthYear)
            return currentYear - birthYear;
        return 0;
        // TODO: Add validation and age calculation
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
    }
}
