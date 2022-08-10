package priority;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {
    public List<Student> getStudents(List<String> events) {
        Comparator<Student> studentComparator = new PrioritySorting();
        PriorityQueue<Student> queue = new PriorityQueue<>(studentComparator);
        for (String line : events) {
            manageQueue(line, queue);
        }
        return createResultList(queue);
    }

    private void manageQueue(String inputLine, PriorityQueue<Student> queue) {
        String[] data = inputLine.split(" ");
        if ("ENTER".equals(data[0])) {
            Student student = new Student(Integer.parseInt(data[3]), data[1], Double.parseDouble(data[2]));
            queue.add(student);
        } else {
            queue.poll();
        }
    }

    private List<Student> createResultList(PriorityQueue<Student> queue) {
        List<Student> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            result.add(queue.poll());
        }
        return result;
    }
}
