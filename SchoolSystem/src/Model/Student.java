package Model;

import java.util.ArrayList;
import java.util.List;

public class Student {

    protected int sid;
    protected String sname;
    protected String susername;
    protected String spassword;
    protected BloodType bl;
    protected List<Lessons> lesson;

    public Student() {
    }

    public Student(String sname, String susername, String spassword, BloodType bl) {
        this.sname = sname;
        this.susername = susername;
        this.spassword = spassword;
        this.bl = bl;
    }
    
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSusername() {
        return susername;
    }

    public void setSusername(String susername) {
        this.susername = susername;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    public BloodType getBl() {
        return bl;
    }

    public void setBl(BloodType bl) {
        this.bl = bl;
    }

    public List<Lessons> getLesson() {
        return lesson;
    }

    public void setLesson(List<Lessons> lesson) {
        this.lesson = lesson;
    }
    
//    public void changeName(String sname){
//        setSname(sname);
//    }
//    public void changePassword(String pass){
//        setSpassword(pass);
//    }
//    
//    public void addLesson(Lessons l){
//        lesson = getLesson();
//        for(Lessons i:lesson){
//            if(i == l){
//                addLesson(l);
//            }
//        }
//    }
//    
//    public Lessons addLesson(Lessons l, ArrayList<Lessons> Alessons){
//        lesson = getLesson();
////        ArrayList<Lessons> lessonsList = getLesson();
//        if(l.getCapacity()>10){
//            System.out.println("There is no enough capacity in this lesson");
//        }
//        else{
//            for(Lessons i : Alessons){
//                if(i==l){
////                    System.out.println("error5");
//                    if(lesson.contains(l)){
//                        System.out.println("Lesson is aleaady in the list "+ l);
//                    }
//                    else{
//                        System.out.println("error6");
////                        lessonsList.add(l);
//                        lesson.add(l);
////                        System.out.println(st);
//                        int  cap = l.getCapacity();
//                        cap = cap - 1;
//                        l.setCapacity(cap);
//                    }
//
//                }
//            }
//        }
//        return l;
//    }
//    public ArrayList<Lessons> removeLesson(Lessons less){
//        lesson = getLesson();
//        if(lesson.contains(less)){
//            lesson.remove(less);
//            int x = less.getCapacity();
//            x ++;
//            less.setCapacity(x);
//        }
//        else{
//            System.out.println("There's no such a lesson " + less);
//        }
//        
//        return lesson;
//    }
//    
//    public void printLessonlist(){
//        ArrayList<Lessons> lessonslist = getLesson();
//        for(Lessons i : lessonslist){
//            System.out.println(i);
//        }
//    }
//    
    @Override
    public String toString() {
        String result = "Student ID \t" + sid + "\n" + "Student Name: \t" + sname + "\n" + "Username: \t" + susername + "\n" + "Password: \t" + spassword + "\n" + "Blood type: \t" + bl + "\n";
        return result;
    }

}
