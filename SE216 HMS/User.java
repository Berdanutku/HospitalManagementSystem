public class User {
    private int userID;
    private String userFullName;
    private String bloodType;
    private int userAge;
    private float userHeight;
    private String userPassword;

    public User(String userFullName,int userID, String userPassword) {
        this.userID=userID;
        this.userPassword=userPassword;
        this.userFullName=userFullName;
    }
    public User(int userID, String userNameSurname, String bloodType, int userAge, float userHeight, String userPassword) {
        this.userID = userID;
        this.userFullName = userNameSurname;
        this.bloodType = bloodType;
        this.userAge = userAge;
        this.userHeight = userHeight;
        this.userPassword = userPassword;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public float getUserHeight() {
        return userHeight;
    }

    public void setUserHeight(float userHeight) {
        this.userHeight = userHeight;
    }
}
