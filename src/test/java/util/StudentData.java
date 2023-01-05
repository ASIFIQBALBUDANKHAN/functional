package util;


import java.util.Arrays;
import java.util.List;

public class StudentData  {

    public static List<Student> getStudents() {
        Student student1 = Student.builder().name("Adam").age(24).city("Dharwad").build();
        Student student2 = Student.builder().name("Mike").age(10).city("Dharwad").build();
        Student student3 = Student.builder().name("abu").age(15).city("Bangalore").build();
        Student student4 = Student.builder().name("Alina").age(16).city("Bangalore").build();

        return Arrays.asList(student1, student2, student3, student4);
        
    }
}
