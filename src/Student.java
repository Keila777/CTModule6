import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    private int Rollnum;
    private String Name;
    private String Address;

    public Student(int Rollnum, String Name, String Address) {
        this.Rollnum = Rollnum;
        this.Name = Name;
        this.Address = Address;
    }

    public int getRollnum() {
        return Rollnum;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    @Override
    public String toString() {
        return "Student: Rollnum = " + Rollnum + ", Name = " + Name + ", Address = " + Address + ".";
    }
}
