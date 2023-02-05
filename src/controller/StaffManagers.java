package controller;

import model.FullTimeStaff;
import model.PartTimeStaff;
import model.Staff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StaffManagers {
    List<Staff> staffList;

    public StaffManagers(List<Staff> staffList) {
        this.staffList = staffList;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    /** Add new staff */
    public void addStaff(Staff staff) {
        staffList.add(staff);
    }

    /** Edit new staff */
    public void editStaff(int index, Staff staff) {
        staffList.set(index, staff);
    }
    /** Delete new staff */
    public void deleteStaff(int index) {
        staffList.remove(index);
    }

    /** Average salary of employees */
    public double getAverageSalary() {
        int averageSalary = 0;
        for (Staff staff : staffList) {
                averageSalary += staff.getActualSalaryReceived() / staffList.size();
        }
        return averageSalary;
    }

    /** List of full-time employees who earn less than average salary */
    public String listedStaff() {
        StringBuilder name = new StringBuilder();
        for (Staff staff : staffList) {
            if( staff instanceof FullTimeStaff &&
                    staff.getActualSalaryReceived() < getAverageSalary()) {
                name.append("\t").append(staff.getFullName()).append(", ");
            }
        }
        return name.toString();
    }

    /** Amount of wages payable to all part-time employees */
    public int getTotalSalary() {
        int totalSalary = 0;
        for (Staff staff : staffList) {
            if( staff instanceof PartTimeStaff) {
                totalSalary += staff.getActualSalaryReceived();
            }
        }
        return totalSalary;
    }

    /** Sort full-time employees by salary ascending */
    public List<FullTimeStaff> sortHardSalary() {
        List<FullTimeStaff> fullTimeStaffs = new ArrayList<>();
        for (Staff staff : staffList) {
            if (staff instanceof FullTimeStaff)
                fullTimeStaffs.add((FullTimeStaff) staff);
        }
        Collections.sort(fullTimeStaffs);
        return fullTimeStaffs;
    }
}
