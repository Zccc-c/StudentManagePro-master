package pers.kuroko.entity;

public class Leader {
    private int groupId;
    private int leaderId;
    private String leaderName;
    private String leaderGender;
    private String leaderEmail;

    public Leader(int groupId, int leaderId, String leaderName, String leaderGender, String leaderEmail) {
        this.groupId = groupId;
        this.leaderId = leaderId;
        this.leaderName = leaderName;
        this.leaderGender = leaderGender;
        this.leaderEmail = leaderEmail;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(int leaderId) {
        this.leaderId = leaderId;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public String getLeaderGender() {
        return leaderGender;
    }

    public void setLeaderGender(String leaderGender) {
        this.leaderGender = leaderGender;
    }

    public String getLeaderEmail() {
        return leaderEmail;
    }

    public void setLeaderEmail(String leaderEmail) {
        this.leaderEmail = leaderEmail;
    }
}
