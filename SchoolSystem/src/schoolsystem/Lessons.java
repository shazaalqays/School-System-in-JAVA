
package schoolsystem;

import java.util.ArrayList;


class Lessons {
    private String id;
    private String name;
    private int capacity;
    ArrayList<Lessons> lessonlist = new ArrayList<Lessons>();
//    ArrayList<Student> studentslist = new ArrayList<Student>();

    
     

     public Lessons(String id, String name, int capacity){
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }
     
     
//    public ArrayList<Student> getStudentslist() {
//        return studentslist;
//    }
//
//    public void setStudentslist(ArrayList<Student> studentslist) {
//        this.studentslist = studentslist;
//    }
//    
//    public void setLessonlist(ArrayList<Lessons> lessonlist) {
//        this.lessonlist = lessonlist;
//    }
//
//    public ArrayList<Lessons> getLessonlist() {
//        return lessonlist;
//    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    
//    public ArrayList<Student> studentsList(ArrayList<Student> students){
//        
////        System.out.println("error2");
//        if( students.isEmpty()){
//            System.out.println("No students");
//        }
//        else{
//            
////            System.out.println("error1");
//            for(Student stu : students){
//                studentslist.add(stu);
////                System.out.println("error0");
////                System.out.println(studentslist.toString());
//            }
//        }
//        return studentslist;
//    }
    
    public Lessons addLesson(Lessons l){
//        String lesson = getId();
//        ArrayList<Lessons> lessonsList = getLesson();
        if(l.getCapacity()>10){
            System.out.println("There is no enough capacity in this lesson");
        }
        else{
            for(Lessons i : lessonlist){
                if(i==l){
//                    System.out.println("error5");
                    if(lessonlist.contains(l)){
                        System.out.println("Lesson is aleaady in the list "+ l);
                    }
                    else{
                        System.out.println("error6");
//                        lessonsList.add(l);
                        lessonlist.add(l);
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
    
    public Lessons removeLesson(Lessons less){
        
        if(lessonlist.contains(less)){
            lessonlist.remove(less);
            int x = less.getCapacity();
            x ++;
            less.setCapacity(x);
        }
        else{
            System.out.println("There's no such a lesson " + less);
        }
        
        return less;
    }
    
    @Override
    public String toString( ) {
        String result = "Lesson ID: \t"+ id + "\nLesson Name: \t" + name+ "\nLesson capacity \t"+capacity+"\n";
        
        return result;
    }

}
