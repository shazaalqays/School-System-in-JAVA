/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operations;

import Model.*;
import java.util.List;


public class StudentOperations {
    
    
   SchoolOperations sc = new SchoolOperations();
   List<Lessons> les = sc.getLessonsList();
   Student s = new Student();
   List<Lessons> lessonslist = s.getLesson();
   Lessons less = new Lessons();
   
    
    
    public void changeName(String sname){
        s.setSname(sname);
    }
    public void changePassword(String pass){
        s.setSpassword(pass);
    }
    
    public void addLesson(Lessons l){
        
//        for(Lessons i: lessons){
            if(les.contains(l)){
                System.out.println("The lesson is already in the list");
            }
            else{
                int cap = l.getCapacity();
                if(cap > 10){
                    System.out.println("There is no enough capacity");
                }
                else{
                    les.add(l);
                    cap = cap-1;
                    l.setCapacity(cap);
                }
                
            }
//        }
    }
    
//    public Lessons addLesson(Lessons l, ArrayList<Lessons> Alessons){
//      ArrayList<Lessons>  lesson = less.getLessonlist();
////        ArrayList<Lessons> lessonsList = getLesson();
//        if(l.getCapacity()>10){
//            System.out.println("There is no enough capacity in this lesson");
//        }
//        else{
//            for(Lessons i : lesson){
//                if(i==l){
////                    System.out.println("error5");
////                    if(lesson.contains(l)){
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
////        }
//        return l;
//    }
    public Lessons removeLesson(Lessons less){
//        List<Lessons> les = sc.getLessonsList();
        if(les.contains(less)){
            les.remove(less);
            int x = less.getCapacity();
            x ++;
            less.setCapacity(x);
        }
        else{
            System.out.println("There's no such a lesson ");
        }
        
        return less;
    }
    
    public void printLessonlist(){
        
        for(Lessons i : les){
            System.out.println(i.toString());
        }
    }
    
}
