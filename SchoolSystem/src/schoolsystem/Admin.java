
package schoolsystem;

import java.util.ArrayList;
import schoolsystem.Student.blood;
import schoolsystem.Teacher.bloodT;
import schoolsystem.LessonType;

public class Admin {
    private String id;
    private String name;
    private String username;
    private String password;
    ArrayList<Teacher> teachersList = new ArrayList<Teacher>();
    ArrayList<Lessons> lessonsList = new ArrayList<Lessons>();
    ArrayList<Student> studentList = new ArrayList<Student>();
    ArrayList<Integer> size = new ArrayList<Integer>();
    ArrayList<Integer> removedIds = new ArrayList<Integer>();
    int count  = 1 ;
    
    public Admin(String id, String name, String username, String password){
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Teacher addTeacher(String name, String username, String password,bloodT bl, LessonType lesson){
//        LessonType le = new LessonType(lesson);
        Teacher t = new Teacher(name,username,password,bl,lesson);
        if(removedIds.isEmpty()){
            count++;
            t.setId(count);
            size.add(count);
            teachersList = getTeachersList();
        }
        else{
            t.setId(size.get(0));
            System.out.println(size.get(0));
        }
        
        if(teachersList.isEmpty()){
            teachersList.add(t);
        }
        else{
            teachersList.add(t);
        }
        return t;
    }

    public ArrayList<Teacher> getTeachersList() {
        return teachersList;
    }

    public ArrayList<Lessons> getLessonsList() {
        return lessonsList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    
    public Lessons addLesson(String id, String name, int capacity){
        Lessons lesson = new Lessons(id, name, capacity);
        lessonsList.add(lesson.addLesson(lesson));
        return lesson;
        
    }
    
    public Student addStudent(String name, String username, String password, blood bl){
        Student st = new Student(name, username, password,bl);
        count++;
        st.setSid(count);
        size.add(count);
        studentList.add(st);
        return st;
    }
    
    public ArrayList<Teacher> removeTeacher(Teacher Tname){
        teachersList = getTeachersList();
        System.out.println("error1");
        if(teachersList.isEmpty()){
            System.out.println("There is no teachers in the list");
        }
        else if(teachersList.contains(Tname)){
            teachersList.remove(Tname);
            int j = Tname.getId();
            if(size.contains(j)){
//                size.remove(j);
                removedIds.add(j);
            }   
        }
        return teachersList;
    }
    
    public void printTeacherslist(){
        ArrayList<Teacher> teacherlist = getTeachersList();
        for(Teacher i : teacherlist){
            System.out.println(i);
        }
    }
    
    public void printStudentslist(){
        ArrayList<Student> studentlist = getStudentList();
        for(Student i : studentlist){
            System.out.println(i);
        }
    }
    public void printIDlist(){
        for(int i : size){
            System.out.println(i);
        }
    }
    
    @Override
    public String toString( ) {
        String result = "Admin ID \t"+ id + "\nAdmin Name: \t" + name+ "\nUsername \t"+ username+"\nPassword \t"+ password+"\n";
        return result;
    }
}
