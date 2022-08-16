package homework08;

import org.junit.jupiter.api.Test;
import siit.homework08.StudentRepository;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    /*
    work in progress
     */

    @Test
    public void nameTest() {
        StudentRepository testStudent = new StudentRepository();

        IllegalArgumentException exce = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    testStudent.addStudent("", "Something", "male", "1234123412341", 1995);
                }
        );

    }

   @Test
    public void listStudentsByNameTest() {

   }
}