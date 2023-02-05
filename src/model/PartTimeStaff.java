package model;

public class PartTimeStaff extends Staff implements Salary {
    private int hour;

    public PartTimeStaff() {
    }

    public PartTimeStaff(int hour) {
        this.hour = hour;
    }

    public PartTimeStaff(int staffCode, String fullName, int age, int phoneNumber, String email, int hour) {
        super(staffCode, fullName, age, phoneNumber, email);
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "PartTimeStaff: " +
                "staff code = " + getStaffCode() +
                ", full name = " + getFullName() +
                ", age = " + getAge() +
                ", phone number = " + getPhoneNumber() +
                ", email = " + getEmail() +
                ", hour = " + getHour();
    }


    @Override
    public int getActualSalaryReceived() {
        return getHour() * 100000;
    }
}
