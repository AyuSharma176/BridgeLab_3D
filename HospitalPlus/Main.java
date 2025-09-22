package HospitalPlus;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to HospitalPlus");
        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Sex (Male/Female): ");
        String sex = sc.nextLine();
        System.out.print("Enter Marital Status (Single/Married): ");
        String status = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter Phone No: ");
        String phoneNo = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Enter Disease/Problem: ");
        String diseases = sc.nextLine();

        Patients patient = new Patients(name, age, sex, address, status, phoneNo, email, diseases);
        System.out.println("\nPatient Registered Successfully!");
        System.out.println(patient);
        System.out.println("\nChoose Service:");
        System.out.println("1. Book Appointment with Doctor (Doctor Recommended Checkup)");
        System.out.println("2. General Checkup");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            Doctor doctor = new Doctor("Dr. Ansh", "Senior Consultant", "Cardiology", "Morning", "10 years", true);
            System.out.println("\nBooking Appointment with " + doctor.getName());

            Appointment appointment = new Appointment(patient.getName(), String.valueOf(patient.getAge()), sex, phoneNo, email, "10:00 AM", diseases, doctor.getName());
            AppointmentManager manager = new AppointmentManager();
            manager.addAppointment(appointment, doctor);

            System.out.println("\nAppointment Confirmed at " + appointment.toString());

            DoctorRecommendedCheckup doctorcheck = new DoctorRecommendedCheckup(Arrays.asList("X-Ray", "Blood Sugar Test", "ECG"), "Further diagnosis needed for " + diseases);

            System.out.println("\nDoctor Recommended Report");
            System.out.println(doctorcheck.checkupdetails());

        } else if (choice == 2) {
            GeneralCheckup gCheck = new GeneralCheckup("O+", "Normal");

            System.out.println("\nGeneral Checkup Report");
            System.out.println(gCheck.checkupdetails());
        } else {
            System.out.println("Invalid Choice!");
        }

        System.out.println("\nThank you for visiting HospitalPlus");
        sc.close();
    }
}
