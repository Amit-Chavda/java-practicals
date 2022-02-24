import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int enrollment;
    float grade;

    public Student(String name, int enrollment, float grade) {
        this.name = name;
        this.enrollment = enrollment;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student student) {
        if (this.grade == student.grade)
            return 0;
        else if (this.grade > student.grade)
            return 1;
        else
            return -1;
    }

}

public class ComparableExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Tony", 101, 93.5f));
        students.add(new Student("Mike", 102, 89.5f));
        students.add(new Student("Jake", 103, 75.25f));
        students.add(new Student("Caryy", 104, 91.1f));

        Collections.sort(students);

        students.forEach((student) -> {
            System.out.println(student.name + " : " + student.grade);
        });
    }
}
