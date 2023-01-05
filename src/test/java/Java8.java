import lombok.val;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import util.Student;
import util.StudentData;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ExtendWith(MockitoExtension.class)
public class Java8 {

    @Test
    void partitioner() {

        val students = StudentData.getStudents();

        Map<Boolean, List<Student>> student_dharwad = students.stream()
                .collect(Collectors
                        .partitioningBy(student -> student.getCity().equals("Dharwad"))
                );
        System.out.println(student_dharwad.get(true));
        System.out.println(student_dharwad.get(false));
    }
}
