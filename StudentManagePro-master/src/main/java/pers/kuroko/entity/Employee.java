package pers.kuroko.entity;

public class Employee {
    private int groupId;
    private int empId;
    private String empName;
    private String gender;
    private String email;

    public Employee(int groupId, int empId, String empName, String gender, String email) {
        this.groupId = groupId;
        this.empId = empId;
        this.empName = empName;
        this.gender = gender;
        this.email = email;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
