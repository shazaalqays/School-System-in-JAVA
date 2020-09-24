
package schoolsystem;

import java.util.ArrayList;

public class School {
    private final String sid;
    private String sname;
    private String address;
    private int postcode;
    private int phonenum;
    private Admin admin;
    
    
    public School(String sid, String sname, String address, int postcode, int phonenum, Admin admin){
        this.sid = sid;
        this.sname = sname;
        this.address = address;
        this.postcode = postcode;
        this.phonenum = phonenum;
        this.admin = admin;
    }

    public String getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public String getAddress() {
        return address;
    }

    public int getPostcode() {
        return postcode;
    }

    public int getPhonenum() {
        return phonenum;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public void setPhonenum(int phonenum) {
        this.phonenum = phonenum;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    
    
    
    
    @Override
    public String toString( ) {
        String result = "School ID \t"+ sid + "\nSchool Name: \t" + sname+ "\nAddress \t"+ address+"\nPostcode \t"+ postcode+"\nAdmin information:\n"+admin+"\n";
        return result;
    }
}
