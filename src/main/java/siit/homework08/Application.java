package siit.homework08;

public class Application {
    public static void main(String[] args) {
        StudentRepository myStudent = new StudentRepository();
        myStudent.addStudent("asd", "tester", "male", "1234123411341", "12/12/1998");
        myStudent.addStudent("aad", "tesger", "male", "1234123111341", "12/12/1993");
        myStudent.addStudent("abd", "tesser", "male", "1234123311341", "12/12/1992");
       /*
        myStudent.listStudentsByDob(); <-- Working as intended
        myStudent.listStudentsByName();<-- ---||---
       */
        myStudent.listAllStudents();
       /*
        System.out.println("--------------------------");
        myStudent.deleteStudent("1234123311341"); <-- Not working.
        myStudent.listAllStudents();
        */

    }
}
