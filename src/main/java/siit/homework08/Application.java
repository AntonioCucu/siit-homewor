package siit.homework08;

public class Application {
    public static void main(String[] args) {
        StudentRepository myStudent = new StudentRepository();
        myStudent.addStudent("Gica", "Lica", "male", "1234123412341", 1992);
        myStudent.addStudent("Bica", "", "Female", "1234113412341", 2012);
        myStudent.addStudent("Nica", "Dica", "male", "1234125112341", 1952);
        myStudent.listAllStudents();
    }
}
