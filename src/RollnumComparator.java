import java.util.Comparator;

public class RollnumComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getRollnum(), student2.getRollnum());
    }
}
