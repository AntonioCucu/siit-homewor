package homework08;

import org.junit.jupiter.api.Assertions;
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
                    testStudent.addStudent("", "Something", "male", "1234123412341", "10/10/1995");
                }
        );

        String exceptionMessage = "java.lang.IllegalArgumentException: (FN)Wrong input format! Only letters allowed.";
        String testMessage = exce.getMessage();

        assertEquals(exceptionMessage, testMessage);
    }

    @Test
    public void cnpTest() {
        StudentRepository testStudent = new StudentRepository();

        IllegalArgumentException exce = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    testStudent.addStudent("test", "tester", "male", "12341234123a1", "10/10/1995");
                }
        );

        String exceptionMessage = "java.lang.IllegalArgumentException: The ID can only contain digits.";
        String testMessage = exce.getMessage();

        Assertions.assertEquals(exceptionMessage,testMessage);
    }
}