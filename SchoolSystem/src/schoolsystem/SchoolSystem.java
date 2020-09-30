
package schoolsystem;

import java.util.ArrayList;
import java.util.Scanner;
import schoolsystem.Student.blood;
import schoolsystem.LessonType;
import schoolsystem.Teacher.bloodT;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SchoolSystem {
    private static boolean isAvailableForLessonType(String lessonType){
        String data= "PHYSICS physics MATHEMATICS mathematics math MATH HISTORY history";
        Pattern pattern = Pattern.compile(lessonType, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(data);
        
       if(matcher.find()){
           return true;
       }
       else{
           return false;
       }  
    }
    
    public static void main(String[] args) {
        Admin a = new Admin("1","Shaza","shazaalqays","12");
        School sch = new School("1","SCHOOL","Beylikduzu",123,053);
        System.out.println(sch);
        System.out.println();
        ArrayList<Lessons> lessonlist = new ArrayList<Lessons>();
        ArrayList<Student> studentlist = new ArrayList<Student>();
        ArrayList<Teacher> teacherlist = new ArrayList<Teacher>();
        ArrayList<String> IDs = new ArrayList<String>();
        ArrayList<String> usernames = new ArrayList<String>();
        usernames.add(a.getUsername());
        IDs.add(a.getId());
//        ArrayList<String> sIDs = new ArrayList<String>();
//        ArrayList<String> susername = new ArrayList<String>();
        ArrayList<String> lIDs = new ArrayList<String>();
        Teacher t = null;
        Student s = null;
        Lessons l = null;
        Lessons l1 = null;
        Student s1 = new Student("shaza","qays","123",blood.AB);
        Student s2 = new Student("shaza","qays","123",blood.AB);
        Student s3 = new Student("shaza","qays","123",blood.AB);
        studentlist.add(s1);
        studentlist.add(s2);
        studentlist.add(s3);
        
        
        
        Teacher t1 = new Teacher("shaza", "shaza", "123", bloodT.A_NEG, LessonType.CHEMSTRY);
        teacherlist.add(t1);
        Teacher t2 = new Teacher("shaza", "qays", "123", bloodT.A_NEG, LessonType.CHEMSTRY);
        teacherlist.add(t2);
        Teacher t3 = new Teacher("shaza", "shaza", "123", bloodT.A_NEG, LessonType.CHEMSTRY);
        teacherlist.add(t3);
//        
        Lessons lesson1 = a.addLesson("1","Geography",10);
        lessonlist.add(lesson1);
        Lessons lesson2 = a.addLesson("2","Mathematic",10);
        lessonlist.add(lesson2);
        Lessons lesson3 = a.addLesson("3","Science",10);
        lessonlist.add(lesson3);
        Lessons lesson4 = a.addLesson("4","History",10);
        lessonlist.add(lesson4);
        Lessons lesson5 = a.addLesson("5","English",10);
        lessonlist.add(lesson5);
        Lessons lesson6 = a.addLesson("6","Chemistry",10);
        lessonlist.add(lesson6);
        Lessons lesson7 = a.addLesson("7","Physics",10);
        lessonlist.add(lesson7);
        Lessons lesson8 = a.addLesson("8","Turkish",10);
        lessonlist.add(lesson8);
        
        
        Scanner admin = new Scanner(System.in);
        int i = 0;
        int j = 0;
        int k = 0;
        int m = 0;
        int f = 0;
        String tID = null;
        String tname = null;
        String tuser = null;
        String tpass = null;
        String sID = null;
        String sname = null;
        String suser = null;
        String spass = null;
        String lID = null;
        while(i == 0){
//            for(String u : usernames){
            System.out.println("Enter username: ");
            String username = admin.nextLine();
            System.out.println("Enter  password: ");
            String password = admin.nextLine();
//            if(usernames.isEmpty()){
//                System.out.println("No registers");
//            }
//            else{
                
            
            
            if(a.getUsername().equals(username)&& password.equals(a.getPassword())){
                m = 0;
                System.out.println("You logged in as an admin");
                System.out.println();
                while(m == 0){
                System.out.println("Press 1 to add a teacher: ");
                System.out.println("Press 2 to add a student: ");
                System.out.println("Press 3 to add a lesson: ");
                System.out.println("Press 4 to remove a teacher: ");
                System.out.println("Press 5 to print teachers list: ");
                System.out.println("Press 6 to print students list: ");
                System.out.println("Press 7 to print IDs list: ");
                System.out.println("Press 8 to exit: ");
                 j = 0;
                 k = 0;
                String choice = admin.nextLine();
                switch (choice) {
                    case "1":
//                        while(j == 0){
//                            System.out.println("Enter teacher ID: ");
//                            tID = admin.nextLine();
//                            if(tIDs.contains(tID)){
//                                System.out.println(tID.contains(tID));
//                                System.out.println("This ID is already taken. Try again");
//                            }
//                            else{
//                                tIDs.add(tID);
//                                j = 1;
//                            }
//                        }
                        System.out.println("Enter teacher name: ");
                        tname = admin.nextLine();
                        while(k == 0){
                            System.out.println("Enter teacher username: ");
                            tuser = admin.nextLine();
                            if(usernames.contains(tuser) || usernames.contains(tuser)){
                                System.out.println("This username is already taken. Try again");
                            }
                            else{
                                usernames.add(tuser);
                                k = 1;
                            }
                        }
                        System.out.println("Enter teacher password: ");
                        tpass = admin.nextLine();
                        System.out.println("Enter teacher blood type: (AB, A_NEG, A_POS, B_NEG, B_POS, O_NEG, O_POS)");
                        String tb = admin.nextLine();
                        bloodT ttb = bloodT.valueOf(tb);
                        System.out.println("Enter teacher lesson type: ");
                        String lt = admin.nextLine();
                        t = a.addTeacher(tname, tuser, tpass,ttb, LessonType.valueOf(lt));
                        if(teacherlist.contains(t)){
                            System.out.println("This teacher is already in the list");
                        }
                        else{
                            teacherlist.add(t);
                        }
                        break;
                        
                    case "2":
//                        while(j == 0){
//                            System.out.println("Enter student ID: ");
//                            sID = admin.nextLine();
//                            if(sIDs.contains(sID) || tIDs.contains(sID)){
//                                System.out.println(sID.contains(sID));
//                                System.out.println("This ID is already taken. Try again");
//                            }
//                            else{
//                                sIDs.add(sID);
//                                j = 1;
//                            }
//                        }
                        System.out.println("Enter student name: ");
                        sname = admin.nextLine();
                        while(k == 0){
                            System.out.println("Enter student username: ");
                            suser = admin.nextLine();
                            if(usernames.contains(suser) || usernames.contains(suser)){
                                System.out.println("This username is already taken. Try again");
                            }
                            else{
                                usernames.add(suser);
                                k = 1;
                            }
                        }
                        System.out.println("Enter student password: ");
                        spass = admin.nextLine();
                        System.out.println("Enter teacher blood type: (AB, A_NEG, A_POS, B_NEG, B_POS, O_NEG, O_POS)");
                        String sb = admin.nextLine();
                        blood ssb = blood.valueOf(sb);
                        s = a.addStudent(sname, suser, spass,ssb);
                        if(studentlist.contains(s)){
                            System.out.println("This student is already in the list");
                        }
                        else{
                            studentlist.add(s);
                        }
                        break;
                    case "3":
                        while(j == 0){
                            System.out.println("Enter lesson ID: ");
                            lID = admin.nextLine();
                            if(lIDs.contains(lID)){
                                System.out.println("This ID is already taken. Try again");
                            }
                            else{
                                lIDs.add(lID);
                                j = 1;
                            }
                        }
                        System.out.println("Enter lesson name: ");
                        String lname = admin.nextLine();
                        
                        System.out.println("Enter lesson capacity: ");
                        int lcap = admin.nextInt();
                        
                        l = a.addLesson(lID, lname, lcap);
                        if(lessonlist.contains(l)){
                            System.out.println("This lesson is already in the list");
                        }
                        else{
                            lessonlist.add(l);
                        }
                        break;
                    case "4":
                        System.out.println("Enter a teacher name to remove");
                        String tename = admin.nextLine();
//                        a.removeTeacher(tename);
                        for(Teacher e : teacherlist){
                            if(e.getName().equals(tename)){
                                a.removeTeacher(e);
                            }
                        }
                        
                        break;
                    case "5":
                        a.printTeacherslist();
                        break;
                    case "6":
                        a.printStudentslist();
                        break;
                    case "7":
                        a.printIDlist();
                        break;
                    case "8":
                        m = 1;
                        break;
                    default:
                        System.out.println("You pressed a wrong number. Try again");
                    }
                }
//        i = 1;
            }
            else if(usernames.contains(username) && usernames.equals(studentlist.contains(s1.getSusername()))){
                
            
//            else if (s1.getSusername().equals(username) && s1.getSpassword().equals(password)){
                m = 0;
//                if(susername.contains(username)){
//                for(Student n: studentlist){
//                    if(n.getSusername().equals(username) &&n.getSpassword().equals(password)){
                        System.out.println("You signed in as a student");
                        System.out.println();
                        while(m == 0){
                            System.out.println("Press 1 to add a lesson: ");
                            System.out.println("Press 2 to remove a lesson: ");
                            System.out.println("Press 3 to print lessons list: ");
                            System.out.println("Press 4 to change name: ");
                            System.out.println("Press 5 to change password: ");
                            System.out.println("Press 6 to exit: ");
                            String choice = admin.nextLine();
                            switch (choice) {
                                case "1":
                                    System.out.println("Choose lesson to add: ");
                                    String lesname = admin.nextLine();
                                    for(Lessons le: lessonlist){
                                        if(le.getName().equals(lesname)){
                                            le.addLesson(le);
                                        }
                                    }
                                    break;
                        
                        
                                case "2":
                                    System.out.println("Choose lesson to remove: ");
                                    String rlesname = admin.nextLine();
                                    for(Lessons le: lessonlist){
                                        if(le.getName().equals(rlesname)){
                                            le.removeLesson(le);
                                        }
                                    }
                                    break;
                                case "3":
                                    s.printLessonlist();
                                    break;
                                case "4":
                                    System.out.println("Enter new name: ");
                                    String snname = admin.nextLine();
                                    s.changeName(snname);
                                    System.out.println(s.getSname());
                                    break;
                                case "5":
                                    System.out.println("Enter new password: ");
                                    String snpass = admin.nextLine();
                                    s.changePassword(snpass);
                                    break;
                                case "6":
                                    m = 1;
                                    break;
                                default:
                                    System.out.println("You pressed a wrong number. Try again");
                            }
                        }
//                    }
//                }   
            }
            else if (usernames.contains(username) && teacherlist.contains(username)){
//            else if (t1.getUsername().equals(username) && t1.getPassword().equals(password)){
                m = 0;
                System.out.println("You signed in as a teacher");
                System.out.println();
                while(m == 0){
                    System.out.println("Press 1 to add a student: ");
                    System.out.println("Press 2 to remove a student: ");
                    System.out.println("Press 3 to print students list: ");
                    System.out.println("Press 4 to change name: ");
                    System.out.println("Press 5 to change password: ");
                    System.out.println("Press 6 to exit: ");
                    System.out.println();
                    String choice = admin.nextLine();
                    switch (choice) {
                        case "1":
                            System.out.println("Choose a lesson: ");
                            String rlessonID1 = admin.nextLine();
                            for(Lessons ln: lessonlist){
                                if(ln.getId().equals(rlessonID1)){
                                    l1 = ln;
                                }
                            }
                            System.out.println("Choose student to add: ");
                            String studentName = admin.nextLine();
                            for(Student std: studentlist){
                                if(std.getSname().equals(studentName)){
                                    t.addStudent(l1,lessonlist,std);
                               }
                                System.out.println("There is no such a student in the list");
                            }
                            break;
                        
                        
                        case "2":
                            System.out.println("Choose a lesson: ");
                            String rlessonID = admin.nextLine();
                            for(Lessons ln: lessonlist){
                                if(ln.getId().equals(rlessonID)){
                                    l1 = ln;
                                }
                            }
                            System.out.println("Choose lesson to remove: ");
                            String rstudentName = admin.nextLine();
                            System.out.println();
                            for(Student std: studentlist){
                                if(std.getSname().equals(rstudentName)){
                                    t.removeStudent(l1,lessonlist, std);
                                }
                            }
                            break;
                        case "3":
                            t.listStudents();
                            break;
                        case "4":
                            System.out.println("Enter new name: ");
                            String tnname = admin.nextLine();
                            t.changeName(tnname);
                            break;
                        case "5":
                            System.out.println("Enter new password: ");
                            String tnpass = admin.nextLine();
                            t.changePassword(tnpass);
                            break;
                        case "6":
                            m = 1;
                            break;
                            default:
                                System.out.println("You pressed a wrong number. Try again");
                    }
                }
            }
            
            else{
                System.out.println("You entered wrong information !!");
                System.out.println("If you want to exit press 0 else press any key: ");
                String ch = admin.nextLine();
                switch(ch){
                    case"0":
                        i = 1;
                        break;
                    default:
                        System.out.println();
                }
            }
//            }
//            }
        }
    }
    
}