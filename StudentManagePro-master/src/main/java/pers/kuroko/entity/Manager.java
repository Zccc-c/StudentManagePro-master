package pers.kuroko.entity;

public class Manager {
    private int deptId;
    private int managerId;
    private String managerName;
    private String managerGender;
    private String managerEmail;

    public Manager(int deptId, int managerId, String managerName, String managerGender, String managerEmail) {
        this.deptId = deptId;
        this.managerId = managerId;
        this.managerName = managerName;
        this.managerGender = managerGender;
        this.managerEmail = managerEmail;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerGender() {
        return managerGender;
    }

    public void setManagerGender(String managerGender) {
        this.managerGender = managerGender;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }
}
