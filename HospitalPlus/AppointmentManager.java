package HospitalPlus;

import java.util.LinkedList;
import java.util.Queue;

public class AppointmentManager {
    private Queue<Appointment> queue;

    public AppointmentManager() {
        queue = new LinkedList<>();
    }
    public void addAppointment(Appointment appointment, Doctor doctor) {
        if (doctor.isAvailable()) {
            appointment.setDoctor(doctor.getName());
            doctor.setAvailable(false);
            System.out.println("Doctor " + doctor.getName() + " assigned to " + appointment);
        } else {
            System.out.println("Doctor " + doctor.getName() + " not available. Added to waiting queue.");
            queue.add(appointment);
        }
    }

    public void assignNextAppointment(Doctor doctor) {
        if (doctor.isAvailable() && !queue.isEmpty()) {
            Appointment next = queue.poll();
            next.setDoctor(doctor.getName());
            doctor.setAvailable(false);
            System.out.println("Doctor " + doctor.getName() + " assigned to " + next);
        } else {
            System.out.println("No pending appointments or doctor still busy.");
        }
    }

    public void freeDoctor(Doctor doctor) {
        doctor.setAvailable(true);
        System.out.println("Doctor " + doctor.getName() + " is now available.");
    }
}
