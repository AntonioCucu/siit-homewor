package siit.homework08;

public class Application {
    public static void main(String[] args) {
        StudentRepository myStudent = new StudentRepository();
        myStudent.addStudent("Gica", "Lica", "male", "1234123412341", "12/12/2020");
        myStudent.addStudent("Bica", "", "Female", "1234113412341", "10/10/2000");
        myStudent.addStudent("Nica", "Dica", "male", "1234125112341", "11/11/1995");
        myStudent.listAllStudents();
    }
}
