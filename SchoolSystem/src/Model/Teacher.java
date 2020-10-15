package Model;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private int id;
    private String name;
    private String username;
    private String password;
    private BloodType bl;
    private LessonType lt;
    private List<Student> student = new ArrayList<>();
    private List<Lessons> lessons = new ArrayList<Lessons>();

    public Teacher(String name, String username, String password, BloodType bl, LessonType lt) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.bl = bl;
        this.lt = lt;
    }

    public Teacher() {
    }
    
    
    // aklında bulunsun tek tek yazma. sağ click -> insert code -> getter ve setter deyince hepsini kendi oluşturur
    // ek olarak bir tane constructor mutlaka boş oluştur. kodda hata almamak adına.
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BloodType getBl() {
        return bl;
    }

    public void setBl(BloodType bl) {
        this.bl = bl;
    }

    public LessonType getLt() {
        return lt;
    }

    public void setLt(LessonType lt) {
        this.lt = lt;
    }

    public List<Student> getStudent() {
        return student;
    }

    public List<Lessons> getLessons() {
        return lessons;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public void setLessons(List<Lessons> lessons) {
        this.lessons = lessons;
    }
    
    
    
   @Override
    public String toString( ) {
        String result = "Teacher ID: \t"+ id + "\nName: \t" + name+ "\nUsername: \t"+ username+"\nPassword: \t"+ password+"\nBlood type: \t"+bl+"\nLesson Type: \t"+lt+"\n";
        return result;
    } 
}