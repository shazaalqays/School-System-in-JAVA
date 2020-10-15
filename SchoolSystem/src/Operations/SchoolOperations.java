package Operations;

import Model.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SchoolOperations {

    private static int count = 1;
    List<Integer> ids = new ArrayList<>();
    List<String> tusernames = new ArrayList<>();
    List<String> susernames = new ArrayList<>();
    List<Teacher> teachersList = new ArrayList<>();
    List<Lessons> lessonsList = new ArrayList<>();
    List<Student> studentList = new ArrayList<>();
    List<Integer> removedIds = new ArrayList<>();

    
    public List<Integer> getIds(){
        return ids;
    }

    public List<String> getTusernames() {
        return tusernames;
    }
    public List<String> getSusernames() {
        return susernames;
    }
    public List<Teacher> getTeachersList() {
        return teachersList;
    }

    public List<Lessons> getLessonsList() {
        return lessonsList;
    }

    /*
    ekleme
    silme
    güncelleme
    listeleme
    arama
     */
    public List<Student> getStudentList() {
        return studentList;
    }
    

    public Admin addAdmin(String name, String username, String password) {
        Admin a = new Admin(name,username,password);
        a.setId(count);
        ids.add(a.getId());
        return a;
    }
    public Teacher addTeacher(String name, String username, String password,BloodType bl, LessonType lesson){

        Teacher t = new Teacher(name,username,password,bl,lesson);
        if(teachersList.isEmpty()){
            count++;
            t.setId(count);
            teachersList.add(t);
            System.out.println(teachersList);
            ids.add(t.getId());
            tusernames.add(t.getUsername());
            return t;
        }
        else if(teachersList.contains(t)){
            System.out.println("This teacher is already in the list");
            return t;
        }
        else{
            for (int i = 0; i< teachersList.size();i++){
                ids.add(teachersList.get(i).getId());
            }
            Integer Max = Collections.max(ids);
            t.setId(Max+1);
            teachersList.add(t);
            ids.add(t.getId());
            tusernames.add(t.getUsername());
            return t;
        }
        
        
        /*
        eklenmek istenen öğretmenin adı soyadı vs bilgilerini elinde olan arraylistten kontrol edeceksin
        aynıları var mı diye
        teacherList.contains olabilir
        ya da equals ile tek tek kontrol edersin
        
        eğer o öğretmen varsa sout ile bu zaten var döndüreceksin
        
        eğer o öğretmen yoksa ekleyeceksin listeye ( listedeki max id'yi alacaksın +1 diyip döndereceksin )
        */
    }
    
    public Student addStudent(String name, String username, String password, BloodType bl){
        Student st = new Student(name, username, password,bl);
        if(studentList.isEmpty()){
            count++;
            st.setSid(count);
            studentList.add(st);
            susernames.add(st.getSname());
            ids.add(st.getSid());
            return st;
        }
        else if(studentList.contains(st)){
            System.out.println("The student is in the list");
            return st;
        }
        else{
            count++;
            st.setSid(count);
            studentList.add(st);
            susernames.add(st.getSname());
            ids.add(st.getSid());
            return st;
        }
    }
    public Lessons addLesson(String id, String name, int capacity){
        Lessons lesson = new Lessons(id, name, capacity);
        if(lessonsList.isEmpty()){
            lessonsList.add(lesson);
        return lesson;
        }
        else if(lessonsList.contains(lesson)){
            System.out.println("The lesson is already in the list");
            return lesson;
        }
        else{
            lessonsList.add(lesson);
            return lesson;
        }
        
    }
    public List<Teacher> removeTeacher(String Tname){
        if(teachersList.isEmpty()){
            System.out.println("There is no teachers in the list");
        }
        else{
            for(Teacher t : teachersList){
                if(t.getName().equals(Tname)){
                    teachersList.remove(t);
                    tusernames.remove(t.getUsername());
                }
            }
        }
        return teachersList;
    }
    
    
    
    public void printTeacherslist(){
        for(Teacher i : teachersList){
            System.out.println(i);
        }
    }
    public void printStudentslist(){
        for(Student i : studentList){
            System.out.println(i);
        }
    }
    public void printIDlist(){
        for(int i =0; i< ids.size();i++){
            System.out.println(i);
        }
    }

}
