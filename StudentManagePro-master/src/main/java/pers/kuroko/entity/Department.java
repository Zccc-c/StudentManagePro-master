package pers.kuroko.entity;

public class Department {
    private int deptId;
    private int managerId;
    private String deptName;

    public Department(int deptId, int managerId, String deptName) {
        this.deptId = deptId;
        this.managerId = managerId;
        this.deptName = deptName;
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

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
