package HospitalPlus;

import java.util.LinkedList;
import java.util.Queue;

public class Appointment {
    private String name;
    private String age;
    private String sex;
    private String phoneNo;
    private String email;
    private String time;
    private String problem;
    private String doctor;

    public Appointment(String name, String age, String sex, String phoneNo, String email, String time, String problem,String doctor) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phoneNo = phoneNo;
        this.email = email;
        this.time = time;
        this.problem = problem;
        this.doctor = doctor;
    }
    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
    @Override
    public String toString() {
        return "Appointment{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", email='" + email + '\'' +
                ", time='" + time + '\'' +
                ", problem='" + problem + '\'' +
                '}';
    }
}
