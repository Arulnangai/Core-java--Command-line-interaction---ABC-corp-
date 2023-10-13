package bean;

import java.util.ArrayList;
import java.util.Date;

public class Employee {
    private int empId;
    private String empName;
    private long mobileNo;
    private Date doj;

    private int totalExp;

    ArrayList<Skill>  skills = new ArrayList<>();

    public Employee(int empId, String empName, long mobileNo, Date doj, int totalExp, ArrayList<Skill> skills) {
        this.empId = empId;
        this.empName = empName;
        this.mobileNo = mobileNo;
        this.doj = doj;
        this.totalExp = totalExp;
        this.skills = skills;
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

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public int getTotalExp() {
        return totalExp;
    }

    public void setTotalExp(int totalExp) {
        this.totalExp = totalExp;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", mobileNo=" + mobileNo +
                ", doj=" + doj +
                ", totalExp=" + totalExp +
                ", skills=" + skills +
                '}';
    }
}
