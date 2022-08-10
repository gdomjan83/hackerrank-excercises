package priority;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PrioritiesTest {

    Priorities priorities = new Priorities();

    @Test
    void testGetStudents() {
        List<String> events = reader.ReadFile.readInput();

        List<Student> result = priorities.getStudents(events);

        assertThat(result).extracting(Student::getName).containsExactly("Dan", "Ashley", "Shafaet", "Maria");
    }
}