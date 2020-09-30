
package schoolsystem;

import java.util.ArrayList;

public class School {
    private final String sid;
    private String sname;
    private String address;
    private int postcode;
    private int phonenum;
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    
    
    public School(String sid, String sname, String address, int postcode, int phonenum){
        this.sid = sid;
        this.sname = sname;
        this.address = address;
        this.postcode = postcode;
        this.phonenum = phonenum;
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


    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }
    
    
    
    
    @Override
    public String toString( ) {
        String result = "School ID \t"+ sid + "\nSchool Name: \t" + sname+ "\nAddress \t"+ address+"\nPostcode \t"+ postcode+"\n";
        return result;
    }
}
