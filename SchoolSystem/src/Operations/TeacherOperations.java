/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operations;

import Model.*;
import java.util.List;


public class TeacherOperations {
    SchoolOperations s = new SchoolOperations();
    Teacher t = new Teacher();
    Lessons lesson = new Lessons();
    Student student = new Student();


    public void changeName(String user,String Uname){
        List<Teacher> te = s.getTeachersList();
//        System.out.println(te);
        for(Teacher th: te){
            System.out.println("error1");
            if(th.getName().equals(user)){
                th.setName(Uname);
                System.out.println("error2");
            }
        }
    }
    
    public void changePassword(String pass){
        List<Teacher> te = s.getTeachersList();
        for(Teacher t: te){
            if(t.getName().equals(pass)){
                t.setPassword(pass);
            }
        }
        
    }
    
    public void listStudents(){
        List<Student> std = t.getStudent();
        for(Student i : std){
            System.out.println("Student Info: \n" +i);
        }
    }
    
    
    public Student removeStudent(Lessons lesson, Student student){
        
        List<Lessons> les = t.getLessons();
//        System.out.println(lessons);
        List<Student> students = t.getStudent();
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
    
    
    public Student addStudent(Lessons les ,Student student){
        List<Student> students = t.getStudent();
        List<Lessons> lessons = t.getLessons();
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

    
}