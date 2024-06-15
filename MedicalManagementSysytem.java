import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Patient {
    private String name;
    private int age;
    private String address;
    
    public Patient(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getAddress() {
        return address;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}

// MedicalManagementSystem class to manage patients
public class MedicalManagementSystem {
    private List<Patient> patients;
    private Scanner scanner;

    public MedicalManagementSystem() {
        patients = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Method to add a new patient
    public void addPatient() {
        System.out.println("Enter patient name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter patient age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        System.out.println("Enter patient address:");
        String address = scanner.nextLine();
        
        Patient newPatient = new Patient(name, age, address);
        patients.add(newPatient);
        
        System.out.println("Patient added successfully.");
    }

    public void displayPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients in the system.");
        } else {
            System.out.println("List of Patients:");
            for (Patient patient : patients) {
                System.out.println(patient);
            }
        }
    }

    
    public static void main(String[] args) {
        MedicalManagementSystem system = new MedicalManagementSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMedical Management System Menu:");
            System.out.println("1. Add New Patient");
            System.out.println("2. Display All Patients");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");

            choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    system.addPatient();
                    break;
                case 2:
                    system.displayPatients();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 3);

        scanner.close();
    }
}

