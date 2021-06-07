package pers.kuroko.entity;

public class Group {
    private int groupId;
    private int LeaderId;
    private int deptId;
    private int managerId;

    public Group(int groupId, int leaderId, int deptId, int managerId) {
        this.groupId = groupId;
        LeaderId = leaderId;
        this.deptId = deptId;
        this.managerId = managerId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getLeaderId() {
        return LeaderId;
    }

    public void setLeaderId(int leaderId) {
        LeaderId = leaderId;
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
}
