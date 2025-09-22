package HospitalPlus;

import java.util.List;

public class DoctorRecommendedCheckup implements Reports {
    private List<String> recommendedTests;
    private String notes;

    public DoctorRecommendedCheckup(List<String> recommendedTests, String notes) {
        this.recommendedTests = recommendedTests;
        this.notes = notes;
    }

    public List<String> getRecommendedTests() {
        return recommendedTests;
    }

    public void setRecommendedTests(List<String> recommendedTests) {
        this.recommendedTests = recommendedTests;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public Patients patientDetails(Patients patient) {
        return patient;
    }

    @Override
    public String checkupdetails() {
        return "Doctor Recommended Tests: " + recommendedTests + "\nNotes: " + notes;
    }
}
