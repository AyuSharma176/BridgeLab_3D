package HospitalPlus;

public class Doctor {
    private String name;
    private String position;
    private String speciality;
    private String shift;
    private String expericence;
    private boolean available;
    Doctor(String name,String position,String speciality,String shift,String experience,boolean available){
        this.name = name;
        this.position = position;
        this.speciality = speciality;
        this.shift = shift;
        this.expericence = experience;
        this.available = available;
    }
    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public String getSpeciality() {
        return speciality;
    }
    public String getShift() {
        return shift;
    }
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    public String getExperience() {
        return expericence;
    }
    public String toString(){
       return "Dr. "+this.name+"\n"+"Position:- "+this.position+"\n"+"Speciality:- "+this.speciality+"\n"+"Shift:- "+this.shift+"\n"+"Experience:- "+this.expericence;
    }
}
