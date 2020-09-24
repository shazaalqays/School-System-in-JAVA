
package schoolsystem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Consumer;

class Student{
    private String sid;
    private String sname;
    private String susername;
    private String spassword;
    private blood bl;
    ArrayList<Lessons> lesson = new ArrayList<Lessons>();

    public void setBl(blood bl) {
        this.bl = bl;
    }

    
    public blood getBl() {
        return bl;
    }

    

    
    enum blood {
        A_NEG, A_POS , B_NEG , B_POS, O_NEG, O_POS , AB
    }
    
    public Student(String sid, String sname, String susername, String spassword, blood bl){
        
        this.sid = sid;
        this.sname = sname;
        this.susername = susername;
        this.spassword = spassword;
        this.bl =bl;
        
   
    }

    public String getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public String getSusername() {
        return susername;
    }

    public String getSpassword() {
        return spassword;
    }


    public ArrayList<Lessons> getLesson() {
        return lesson;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setSusername(String susername) {
        this.susername = susername;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }


    public void setLesson(ArrayList<Lessons> lesson) {
        this.lesson = lesson;
    }

    
    
    public void changeName(String sname){
        setSname(sname);
    }
    public void changePassword(String pass){
        setSpassword(pass);
    }
    
    public Lessons addLesson(Lessons l, ArrayList<Lessons> Alessons){
        lesson = getLesson();
//        ArrayList<Lessons> lessonsList = getLesson();
        if(l.getCapacity()>10){
            System.out.println("There is no enough capacity in this lesson");
        }
        else{
            for(Lessons i : Alessons){
                if(i==l){
//                    System.out.println("error5");
                    if(lesson.contains(l)){
                        System.out.println("Lesson is aleaady in the list "+ l);
                    }
                    else{
                        System.out.println("error6");
//                        lessonsList.add(l);
                        lesson.add(l);
//                        System.out.println(st);
                        int  cap = l.getCapacity();
                        cap = cap - 1;
                        l.setCapacity(cap);
                    }

                }
            }
        }
        return l;
    }
    public ArrayList<Lessons> removeLesson(Lessons less){
        lesson = getLesson();
        if(lesson.contains(less)){
            lesson.remove(less);
            int x = less.getCapacity();
            x ++;
            less.setCapacity(x);
        }
        else{
            System.out.println("There's no such a lesson " + less);
        }
        
        return lesson;
    }
    
    public void printLessonlist(){
        ArrayList<Lessons> lessonslist = getLesson();
        for(Lessons i : lessonslist){
            System.out.println(i);
        }
    }
    
    @Override
    public String toString( ) {
        String result = "Student ID \t"+ sid+"\n" + "Student Name: \t" + sname+"\n" + "Username: \t"+ susername+"\n" +"Password: \t"+ spassword+"\n" +"Blood type: \t"+bl+"\n";
        return result;
    }
    
}
