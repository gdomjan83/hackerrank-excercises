package priority;

import reader.ReadFile;

import java.util.List;

/*
In the resources/input.txt file there are a number of students who wait to be served. Two types of events, ENTER and SERVED, can take place which are described below.

    ENTER: A student with some priority enters the queue to be served.
    SERVED: The student with the highest priority is served (removed) from the queue.

A unique id is assigned to each student entering the queue. The queue serves the students based on the following criteria (priority criteria):

    The student having the highest Cumulative Grade Point Average (CGPA) is served first.
    Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
    Any students having the same CGPA and name will be served in ascending order of the id.

The Priorities class should implement the method List<Student> getStudents(List<String> events) to process all the given events and return all the students yet to be served in the priority order.
 */

public class Solution {
    public static void main(String[] args) {
        List<String> events = ReadFile.readInput();

        List<Student> students = new Priorities().getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
