package siit.homework08;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentRepository {
    public final Set<Student> students = new HashSet<>();
    //Logger initialization.
    private static final Logger log = LogManager.getLogger();

    //Creating the comparators for listing the object.
    Comparator<Student> ageComp = (Student o1, Student o2) -> (o1.getAge().compareTo(o2.getAge()));
    Comparator<Student> nameComp = (Student o1, Student o2) -> (o1.getLastName().compareTo(o2.getLastName()));

    public void addStudent(String firstName, String lastName, String gender, String id, String birthDate) {
        // Declared temporary variables to check format and create the object.
        String fname, lname, gen, cnp, dob;

        // Parse dateOfBirth from string to int/date to be able to check for format/min-max age.
        int yearOfBirth = LocalDate.parse(
                birthDate,
                DateTimeFormatter.ofPattern("dd/MM/uuuu")
        ).getYear();
        // Checking input for object constructor.
        try {
            if (!firstName.matches("[a-zA-Z]+")) {
                throw new IllegalArgumentException("(FN)Wrong input format! Only letters allowed.");
            } else if (firstName.isEmpty() || firstName.isBlank()) {
                throw new IllegalArgumentException("This field is mandatory!");
            } else fname = firstName;

            if (!lastName.matches("[a-zA-Z]+")) {
                throw new IllegalArgumentException("(LN)Wrong input format! Only letters allowed.");
            } else if (lastName.isEmpty()) {
                throw new IllegalArgumentException("This field is mandatory!");
            } else lname = lastName;

            if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")) {
                gen = gender;
            } else {
                throw new IllegalArgumentException("Wrong input format. Only Male/Female allowed.");
            }

            if (id.length() != 13) {
                throw new IllegalArgumentException("The ID needs to be 13 characters long.");
            } else if (!id.matches("[0-9]+")) {
                throw new IllegalArgumentException("The ID can only contain digits.");
            } else if (id.isEmpty()) {
                throw new IllegalArgumentException("ID is mandatory!");
            } else cnp = id;

            if (yearOfBirth < 1900) {
                throw new IllegalArgumentException("Year of birth has to be over 1900.");
            } else if (yearOfBirth > LocalDate.now().getYear() - 18) {
                throw new IllegalArgumentException("You need to be at least 18 years old.");
            } else dob = birthDate;

            Student student = new Student(fname, lname, gen, cnp, dob);
            students.add(student);

        } catch (IllegalArgumentException exce) {
            log.error(exce.getMessage());
            throw new IllegalArgumentException(exce);
        }

    }
    // Iterate through list of object, find the id, remove the object (not working as intended).
    public void deleteStudent(String id) {
        int valid = 0;

        for(Student student : students) {
            if(student.getId().equals(id)) {
                students.remove(student);
                valid += 1;
            }
        }

        if (valid == 0) System.out.println("This student is not registered");
    }

    public void listAllStudents(){
        for(Student student : students) {
            System.out.println(student);
        }
    }

    public void listStudentsByAge(Integer age) {
        int valid = 0;

        for(Student student : students) {
            if(student.getAge().equals(age)) {
                System.out.println(student);
                valid += 1;
            }
        }

        if(valid == 0) System.out.println("No students found.");
    }

    public void listStudentsByDob(){
        Set<Student> byDob = new TreeSet<>(ageComp);
        byDob.addAll(students);

        for(Student student : byDob) {
            System.out.println(student);
        }
    }

    public void listStudentsByName(){
        Set<Student> byName = new TreeSet<>(nameComp);
        byName.addAll(students);

        for(Student student : byName) {
            System.out.println(student);
        }
    }

}