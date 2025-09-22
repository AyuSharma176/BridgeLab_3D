package HospitalPlus;

public class GeneralCheckup implements Reports {
    private String bloodGroup;
    private String bloodReport;

    public GeneralCheckup(String bloodGroup, String bloodReport) {
        this.bloodGroup = bloodGroup;
        this.bloodReport = bloodReport;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getBloodReport() {
        return bloodReport;
    }

    public void setBloodReport(String bloodReport) {
        this.bloodReport = bloodReport;
    }

    @Override
    public Patients patientDetails(Patients patient) {
        return patient;
    }

    @Override
    public String checkupdetails() {
        return "Blood Group: " + bloodGroup + ", Blood Report: " + bloodReport;
    }
}
