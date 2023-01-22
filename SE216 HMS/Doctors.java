import java.util.ArrayList;

public class Doctors {
    private String profession;
    private int doctorAge;
    private String doctorFullName;
    private double availableTime;
    private int availableDate;

    public Doctors(String profession, int doctorAge, String doctorFullName, double availableTime, int availableDate) {
        this.profession = profession;
        this.doctorAge = doctorAge;
        this.doctorFullName = doctorFullName;
        this.availableTime = availableTime;
        this.availableDate = availableDate;
    }

    static void displayDoctors(ArrayList<Doctors> doctors) {

        System.out.println("\n*-*-*-* Items *-*-*-*");
        for(int i = 0;i < doctors.size(); i++) {

            System.out.println((i+1) + "-) " + "a.Doctors Name:\t\t " + doctors.get(i).getDoctorFullName() +
                    "\n    a.Doctors Profession:\t " + doctors.get(i).getProfession() +
                    "\n    a.Doctors Age:\t\t " + doctors.get(i).getDoctorAge() +
                    "\n    Available Date:\t\t " + doctors.get(i).getAvailableDate() +
                    "\n    Available Time: \t " + doctors.get(i).getAvailableTime() + "\n");
        }
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getDoctorAge() {
        return doctorAge;
    }

    public void setDoctorAge(int doctorAge) {
        this.doctorAge = doctorAge;
    }

    public String getDoctorFullName() {
        return doctorFullName;
    }

    public void setDoctorFullName(String doctorFullName) {
        this.doctorFullName = doctorFullName;
    }

    public double getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(double availableTime) {
        this.availableTime = availableTime;
    }

    public int getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(int availableDate) {
        this.availableDate = availableDate;
    }
}