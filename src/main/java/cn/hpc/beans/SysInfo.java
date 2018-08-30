package cn.hpc.beans;

public class SysInfo {

    private int ID;
    private String sKey;
    private String sValue;

    public SysInfo() {
    }

    public SysInfo(int ID, String sKey, String sValue) {
        this.ID = ID;
        this.sKey = sKey;
        this.sValue = sValue;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getsKey() {
        return sKey;
    }

    public void setsKey(String sKey) {
        this.sKey = sKey;
    }

    public String getsValue() {
        return sValue;
    }

    public void setsValue(String sValue) {
        this.sValue = sValue;
    }
}
