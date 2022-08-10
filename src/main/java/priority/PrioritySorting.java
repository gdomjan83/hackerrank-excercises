package priority;

import java.util.Comparator;

public class PrioritySorting implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getCGPA() == o2.getCGPA()) {
            return compareName(o1, o2);
        } else if (o1.getCGPA() > o2.getCGPA()) {
            return -1;
        } else {
            return 1;
        }
    }

    private int compareID(Student o1, Student o2) {
        if (o1.getID() < o2.getID()) {
            return -1;
        }
        return 1;
    }

    private int compareName(Student o1, Student o2) {
        if (o1.getName().equals(o2.getName())) {
            return compareID(o1, o2);
        } else {
            return (o1.getName().compareTo(o2.getName()));
        }
    }
}
