public class Appointment {
    private User user;
    private Doctors doctor;
    private int Date;
    private double Time;

    public Appointment(User user, Doctors doctor, int date, double time) {
        this.user = user;
        this.doctor = doctor;
        this.Date = date;
        this.Time = time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Doctors getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctors doctor) {
        this.doctor = doctor;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int date) {
        Date = date;
    }

    public double getTime() {
        return Time;
    }

    public void setTime(double time) {
        Time = time;
    }
}