package schoolsystem;

//import Operations.StudentOperations;
import Model.School;
import Model.Admin;
import Model.*;
import java.util.Scanner;
import Model.LessonType;
import Operations.*;
import java.util.List;
import Design.*;

public class SchoolSystem {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
//        Admin a = new Admin("1", "Shaza", "shazaalqays", "12");
        School sch = new School("1", "SCHOOL", "Beylikduzu", 123, 053);
//        StudentOperations so = new StudentOperations();

//        System.out.println(sch);
//        System.out.println();

        
        
        
        
        
//        usernames.add(a.getUsername());
//        IDs.add(a.getId());
        
        
//        ArrayList<String> sIDs = new ArrayList<String>();
//        ArrayList<String> susername = new ArrayList<String>();
//        ArrayList<String> lIDs = new ArrayList<String>();
//        Teacher t = null;
//        Student s = null;
//        Lessons l = null;
//        Lessons l1 = null;
//        Student s1 = new Student("shaza", "qays", "123", BloodType.ABPLUS); // bloodType enumun yok
//        Student s2 = new Student("shaza", "qays", "123", BloodType.ABPLUS);
//        Student s3 = new Student("shaza", "qays", "123", BloodType.ABPLUS);
//        studentlist.add(s1);
//        studentlist.add(s2);
//        studentlist.add(s3);

        SchoolOperations so = new SchoolOperations();
        Admin a  = so.addAdmin("Shaza", "shaza", "123");
        StudentOperations sp = new StudentOperations();
        TeacherOperations to = new TeacherOperations();
        List<Teacher> teacherlist = so.getTeachersList();
        List<Student> studentlist = so.getStudentList();
        List<Lessons> lessonlist = so.getLessonsList();
        List<String> tusernames = so.getTusernames();
        List<String> susernames = so.getSusernames();
        Lessons l1 = new Lessons();
        
//        // 1 .yöntem
//        
//        t = new Teacher();
//        t.setId(1);
//        t.setName("Tuğba");
        
        
//        
//        Teacher t1 = new Teacher("shaza", "shaza", "123", BloodType.ABPLUS, LessonType.CHEMSTRY); // 2.yöntem
//        teacherlist.add(t1);
//        Teacher t2 = new Teacher("shaza", "qays", "123", BloodType.ABPLUS, LessonType.CHEMSTRY);
//        teacherlist.add(t2);
//        Teacher t3 = new Teacher("shaza", "shaza", "123", BloodType.ABPLUS, LessonType.CHEMSTRY);
//        teacherlist.add(t3);
//        
//        Lessons lesson1 = a.addLesson("1", "Geography", 10);
//        lessonlist.add(lesson1);
//        Lessons lesson2 = a.addLesson("2", "Mathematic", 10);
//        lessonlist.add(lesson2);
//        Lessons lesson3 = a.addLesson("3", "Science", 10);
//        lessonlist.add(lesson3);
//        Lessons lesson4 = a.addLesson("4", "History", 10);
//        lessonlist.add(lesson4);
//        Lessons lesson5 = a.addLesson("5", "English", 10);
//        lessonlist.add(lesson5);
//        Lessons lesson6 = a.addLesson("6", "Chemistry", 10);
//        lessonlist.add(lesson6);
//        Lessons lesson7 = a.addLesson("7", "Physics", 10);
//        lessonlist.add(lesson7);
//        Lessons lesson8 = a.addLesson("8", "Turkish", 10);
//        lessonlist.add(lesson8);

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
        while (i == 0) {
//            for(String u : usernames){
            System.out.println("Enter username: ");
            String username = admin.nextLine();
            System.out.println("Enter  password: ");
            String password = admin.nextLine();
//            if(usernames.isEmpty()){
//                System.out.println("No registers");
//            }
//            else{

            if (username.equals(a.getUsername()) && password.equals(a.getPassword())) {
                m = 0;
                System.out.println("You logged in as an admin");
                System.out.println();
                while (m == 0) {
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
                            System.out.println("Enter teacher name: ");
                            tname = admin.nextLine();
//                            while (k == 0) {
                                System.out.println("Enter teacher username: ");
                                tuser = admin.nextLine();
//                                if (tusernames.contains(tuser)) {
//                                    System.out.println("This username is already taken. Try again");
//                                } else {
//                                    tusernames.add(tuser);
//                                    k = 1;
//                                }
//                            }
                            System.out.println("Enter teacher password: ");
                            tpass = admin.nextLine();
                            System.out.println("Enter teacher blood type: (APLUS, AMIN, BPLUS, BMIN, ZEROPLUS, ZEROMIN, ABPLUS)");
                            String tb = admin.nextLine();
                            BloodType ttb = BloodType.valueOf(tb);
                            System.out.println("Enter teacher lesson type: ");
                            String lt = admin.nextLine();
                            LessonType llt = LessonType.valueOf(lt);
                            so.addTeacher(tname, tuser, tpass, ttb, llt);
                            break;

                        case "2":
                            System.out.println("Enter student name: ");
                            sname = admin.nextLine();
//                            while (k == 0) {
                                System.out.println("Enter student username: ");
                                suser = admin.nextLine();
//                                if (susernames.contains(suser)) {
//                                    System.out.println("This username is already taken. Try again");
//                                } else {
//                                    susernames.add(suser);
//                                    k = 1;
//                                }
//                            }
                            System.out.println("Enter student password: ");
                            spass = admin.nextLine();
                            System.out.println("Enter teacher blood type: (APLUS, AMIN, BPLUS, BMIN, ZEROPLUS, ZEROMIN, ABPLUS)");
                            String sb = admin.nextLine();
                            BloodType ssb = BloodType.valueOf(sb);
                            so.addStudent(sname, suser, spass, ssb);
                            break;
                        case "3":
                            System.out.println("Enter lesson ID: ");
                            lID = admin.nextLine();
                                
                            System.out.println("Enter lesson name: ");
                            String lname = admin.nextLine();

                            System.out.println("Enter lesson capacity: ");
                            int lcap = admin.nextInt();

                            so.addLesson(lID, lname, lcap);
                           
                            break;
                        case "4":
                            System.out.println("Enter a teacher name to remove");
                            String tename = admin.nextLine();
                            so.removeTeacher(tename);

                            break;
                        case "5":
                            so.printTeacherslist();
                            break;
                        case "6":
                            so.printStudentslist();
                            break;
                        case "7":
                            so.printIDlist(); // adminListesi printList ettirilmelii
                            break;
                        case "8":
                            m = 1;
                            break;
                        default:
                            System.out.println("You pressed a wrong number. Try again");
                    }
                }
//        i = 1;
            } else if (susernames.contains(username)) {
                
//            else if (s1.getSusername().equals(username) && s1.getSpassword().equals(password)){
                m = 0;
//                if(susername.contains(username)){
//                for(Student n: studentlist){
//                    if(n.getSusername().equals(username) &&n.getSpassword().equals(password)){
                System.out.println("You signed in as a student");
                System.out.println();
                while (m == 0) {
                    System.out.println("Press 1 to add a lesson: ");
                    System.out.println("Press 2 to remove a lesson: ");
                    System.out.println("Press 3 to print lessons list: ");
                    System.out.println("Press 4 to change name: ");
                    System.out.println("Press 5 to change password: ");
                    System.out.println("Press 6 to exit: ");
                    String choice = admin.nextLine();
                    switch (choice) {
                        case "1":
                            System.out.println("Choose lesson name to add: ");
                            String lesname = admin.nextLine();
                            for (Lessons le : lessonlist) {
                                if (le.getName().equals(lesname)) {
                                    sp.addLesson(le);
                                }
                            }
                            break;

                        case "2":
                            System.out.println("Choose lesson name to remove: ");
                            String rlesname = admin.nextLine();
                            for (Lessons le : lessonlist) {
                                if (le.getName().equals(rlesname)) {
                                    sp.removeLesson(le);
                                }
                            }
                            break;
                        case "3":
                            break;
                        case "4":
                            System.out.println("Enter new name: ");
                            String snname = admin.nextLine();
                            sp.changeName(snname);
//                            System.out.println(sp.getSname());
                            break;
                        case "5":
                            System.out.println("Enter new password: ");
                            String snpass = admin.nextLine();
                            sp.changePassword(snpass);
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
            } else if (tusernames.contains(username)) {
//            else if (t1.getUsername().equals(username) && t1.getPassword().equals(password)){
                m = 0;
                System.out.println("You signed in as a teacher");
                System.out.println();
                while (m == 0) {
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
                            System.out.println("Choose a lesson name: ");
                            String rlessonID1 = admin.nextLine();
                            for (Lessons ln : lessonlist) {
                                if (ln.getName().equals(rlessonID1)) {
                                    l1 = ln;
                                }
                            }
                            System.out.println("Choose student name to add: ");
                            String studentName = admin.nextLine();
                            for (Student std : studentlist) {
                                if (std.getSname().equals(studentName)) {
                                    to.addStudent(l1, std);
                                }
                                System.out.println("There is no such a student in the list");
                            }
                            break;

                        case "2":
                            System.out.println("Choose a lesson name: ");
                            String rlessonID = admin.nextLine();
                            for (Lessons ln : lessonlist) {
                                if (ln.getId().equals(rlessonID)) {
                                    l1 = ln;
                                }
                            }
                            System.out.println("Choose lesson name to remove: ");
                            String rstudentName = admin.nextLine();
                            System.out.println();
                            for (Student std : studentlist) {
                                if (std.getSname().equals(rstudentName)) {
                                    to.removeStudent(l1, std);
                                }
                            }
                            break;
                        case "3":
                            to.listStudents();
                            break;
                        case "4":
                            System.out.println("Enter new name: ");
                            String tnname = admin.nextLine();
                            to.changeName(username,tnname);
                            break;
                        case "5":
                            System.out.println("Enter new password: ");
                            String tnpass = admin.nextLine();
                            to.changePassword(tnpass);
                            break;
                        case "6":
                            m = 1;
                            break;
                        default:
                            System.out.println("You pressed a wrong number. Try again");
                    }
                }
            } else {
                System.out.println("You entered wrong information !!");
                System.out.println("If you want to exit press 0 else press any key: ");
                String ch = admin.nextLine();
                switch (ch) {
                    case "0":
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
