package siit.homework08;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private final String firstName;
    private final String lastName;
    private final String gender;
    private final String id;
    private final Integer birthDate;
    private Integer age;

    public Student(String firstName, String lastName, String gender, String id, Integer birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.id = id;
        this.birthDate = birthDate;

        age = LocalDate.now().getYear() - birthDate;
    }

    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(gender, student.gender) &&
                Objects.equals(id, student.id) &&
                Objects.equals(birthDate, student.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, id, birthDate);
    }

    @Override
    public String toString() {
        return "Student { Name: " + firstName + " " + lastName + "\n" + "ID: " + id + "\n" + "Date of Birth: " + birthDate + "\n";
    }
}
