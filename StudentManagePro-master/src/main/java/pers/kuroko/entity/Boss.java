package pers.kuroko.entity;

public class Boss {
    private int bossId;
    private String bossName;
    private String bossGender;
    private String bossEmail;

    public Boss(int bossId, String bossName, String bossGender, String bossEmail) {
        this.bossId = bossId;
        this.bossName = bossName;
        this.bossGender = bossGender;
        this.bossEmail = bossEmail;
    }

    public int getBossId() {
        return bossId;
    }

    public void setBossId(int bossId) {
        this.bossId = bossId;
    }

    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public String getBossGender() {
        return bossGender;
    }

    public void setBossGender(String bossGender) {
        this.bossGender = bossGender;
    }

    public String getBossEmail() {
        return bossEmail;
    }

    public void setBossEmail(String bossEmail) {
        this.bossEmail = bossEmail;
    }
}
