package com.example.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Staff_Master")
public class Staff {
    private int staffid;
    private String staffname;
    private long staffmobile;  // Changed from int to long
    private String staffemail;
    private String staffrole;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getStaffid() {
        return staffid;
    }

    public void setStaffid(int staffid) {
        this.staffid = staffid;
    }

    @Column(nullable = false)
    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    @Column(nullable = false)
    public long getStaffmobile() {  // Updated getter
        return staffmobile;
    }

    public void setStaffmobile(long staffmobile) {  // Updated setter
        this.staffmobile = staffmobile;
    }

    @Column(nullable = false)
    public String getStaffemail() {
        return staffemail;
    }

    public void setStaffemail(String staffemail) {
        this.staffemail = staffemail;
    }

    @Column(nullable = false)
    public String getStaffrole() {
        return staffrole;
    }

    public void setStaffrole(String staffrole) {
        this.staffrole = staffrole;
    }

    @Override
    public String toString() {
        return "Staff [staffid=" + staffid + ", staffname=" + staffname
                + ", staffmobile=" + staffmobile + ", staffemail=" + staffemail + ", staffrole=" + staffrole + "]";
    }
}