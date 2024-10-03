package project.java.com.physicswallah.blc;

public class Main {
    public static void main(String[] args) {
        // Create some patients
        Patient patient1 = new Patient("John ", 30, "Male");
        Patient patient2 = new Patient("Jane Smith", 25, "Female");

        // Create some doctors
        Doctor doctor1 = new Doctor("Dr. Alice", "Cardiology");
        Doctor doctor2 = new Doctor("Dr. Bob", "Neurology");

        // Create some appointments
        Appointment appointment1 = new Appointment(patient1, doctor1, "2024-07-20");
        Appointment appointment2 = new Appointment(patient2, doctor2, "2024-07-21");

        // Print the appointments
        System.out.println(appointment1);
        System.out.println(appointment2);
    }
}
