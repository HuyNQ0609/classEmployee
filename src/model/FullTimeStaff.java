package model;

public class FullTimeStaff extends Staff implements Salary, Comparable<FullTimeStaff> {
    public int reward;
    public int fine;
    public int hardSalary;

    public FullTimeStaff() {
    }

    public FullTimeStaff(int reward, int fine, int hardSalary) {
        this.reward = reward;
        this.fine = fine;
        this.hardSalary = hardSalary;
    }

    public FullTimeStaff(int staffCode, String fullName, int age, int phoneNumber, String email, int reward, int fine, int hardSalary) {
        super(staffCode, fullName, age, phoneNumber, email);
        this.reward = reward;
        this.fine = fine;
        this.hardSalary = hardSalary;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(int hardSalary) {
        this.hardSalary = hardSalary;
    }

    @Override
    public String toString() {
        return "FullTimeStaff: " +
                "staff code = " + getStaffCode() +
                ", full name = " + getFullName() +
                ", age = " + getAge() +
                ", phone number = " + getPhoneNumber() +
                ", email = " + getEmail() +
                ", reward = " + getReward() +
                ", fine = " + getFine() +
                ", hard salary = " + getHardSalary();
    }

    @Override
    public int getActualSalaryReceived() {
        return getHardSalary() + getReward() - getFine();
    }

    @Override
    public int compareTo(FullTimeStaff o) {
        return getHardSalary() - o.getHardSalary();
    }
}
