import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void selectionSort(List<Student> students, Comparator<Student> comparator) {
        int n = students.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(students.get(j), students.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            Collections.swap(students, i, minIndex);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Xavier", "7700 Main St"));
        students.add(new Student(2, "Aleiya", " 82324 Elmo Rd"));
        students.add(new Student(3, "Bobbie", "4789 Oakland St"));
        students.add(new Student(4, "Jean", "1017 Pinewood St"));
        students.add(new Student(5, "Wilson", "42909 Cedarcrest St"));
        students.add(new Student(6, "Marcus", "3073 Maple Ridge St"));
        students.add(new Student(7, "Kayla",  "60519 Pirch Rd"));
        students.add(new Student(8, "Meila", "1212 Sonali St"));
        students.add(new Student(9, "Nathan", "1119 Cypress Hill "));
        students.add(new Student(10, "Keila", "4185 Beverley Hills St"));
        selectionSort(students, new NameComparator());
        System.out.println("Sorted by Name:");
        for (Student student : students) {
            System.out.println(student);
        }
        selectionSort(students, new RollnumComparator());
        System.out.println("\nSorted by Roll Number:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
