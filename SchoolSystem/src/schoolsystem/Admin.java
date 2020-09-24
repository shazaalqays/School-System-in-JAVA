
package schoolsystem;

import java.util.ArrayList;
import schoolsystem.Student.blood;
import schoolsystem.Teacher.bloodT;
import schoolsystem.Teacher.LessonType;

public class Admin {
    private String id;
    private String name;
    private String username;
    private String password;
    ArrayList<Teacher> teachersList = new ArrayList<Teacher>();
    ArrayList<Lessons> lessonsList = new ArrayList<Lessons>();
    ArrayList<Student> studentList = new ArrayList<Student>();
    
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
    
    public Teacher addTeacher(String id, String name, String username, String password,bloodT bl, LessonType lesson){
//        LessonType le = new LessonType(lesson);
        Teacher t = new Teacher(id,name,username,password,bl,lesson);
        teachersList = getTeachersList();
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
        lessonsList.add(lesson);
        return lesson;
        
    }
    
    public Student addStudent(String id, String name, String username, String password, blood bl){
        Student st = new Student(id, name, username, password,bl);
        studentList.add(st);
        return st;
    }
    
    public void printTeacherslist(){
        ArrayList<Teacher> teacherlist = getTeachersList();
        for(Teacher i : teacherlist){
            System.out.println(i);
        }
    }
    
    @Override
    public String toString( ) {
        String result = "Admin ID \t"+ id + "\nAdmin Name: \t" + name+ "\nUsername \t"+ username+"\nPassword \t"+ password+"\n";
        return result;
    }
}
