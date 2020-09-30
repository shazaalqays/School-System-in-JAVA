
package schoolsystem;

import java.util.ArrayList;

class Teacher {
    private int id;
    private String name;
    private ArrayList<Lessons> lessons = new ArrayList<Lessons>();
    private ArrayList<Student> students = new ArrayList<Student>();
    private String username;
    private String password;
    private bloodT bl;
    private LessonType lt;
    enum bloodT {
        A_NEG , A_POS , B_NEG , B_POS, O_NEG, O_POS , AB
    }

    
    public Teacher(String name, String username, String password,bloodT bl, LessonType lt){
//        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.lt = lt;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Lessons> getLessons() {
        return lessons;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLessons(ArrayList<Lessons> lessons) {
        this.lessons = lessons;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   

    public bloodT getBl() {
        return bl;
    }

    public LessonType getLt() {
        return lt;
    }


    public void setBl(bloodT bl) {
        this.bl = bl;
    }

    public void setLt(LessonType lt) {
        this.lt = lt;
    }

    
    
    
    
    
    public void changeName(String Uname){
        setName(Uname);
        
    }
    public void changePassword(String pass){
        setPassword(pass);
    }
    
    public void listStudents(){
        ArrayList<Student> std = getStudents();
        for(Student i : std){
            System.out.println("Student Info: \n" +i);
        }
    }
    
    
    
    public void openLesson(Lessons lesson){
        lessons.add(lesson);
        System.out.println("Lesson added");
    }
    
    public void closeLesson(Lessons lesson){
        lessons.remove(lesson);
        System.out.println("Lesson removed");
    }
    
    public Student removeStudent(Lessons lesson,ArrayList<Lessons> arrles,  Student student){
        
        ArrayList<Lessons> les = arrles;
//        System.out.println(lessons);
        students = getStudents();
        if(les.contains(lesson)){
            if(students.isEmpty()){
                System.out.println("There is no student");
            }
            else if(students.contains(student)){
                System.out.println("Student removed:  \n"+ student);
//                lesson.remove(student);
                students.remove(student);
                
            }
            else{
                System.out.println("Student is not in the list");
            }
            
        }
        else{
            System.out.println("No lesson was found");
        }

        return student;
    }
    
    
    public Student addStudent(Lessons les,ArrayList<Lessons> arrle,Student student){
        students = getStudents();
        ArrayList<Lessons> lessons = arrle;
        if(lessons.contains(les)){
            if(students.isEmpty()){
//                les.studentslist.add(student);
                students.add(student);
                System.out.println("Student added: \n"+ student);
            }
            else if( students.contains(student)){
                System.out.println("Student is aleaady in the list ");
            }
            else{
//                les.studentslist.add(student);
                students.add(student);
                System.out.println("Student added: \n"+ student);
            }
            
        }
        else{
            System.out.println("No lesson was found");
        }
        return student;
    }
    @Override
    public String toString( ) {
        String result = "Teacher ID: \t"+ id + "\nName: \t" + name+ "\nUsername: \t"+ username+"\nPassword: \t"+ password+"\nBlood type: \t"+bl+"\nLesson Type: \t"+lt+"\n";
        return result;
    }
    
}
