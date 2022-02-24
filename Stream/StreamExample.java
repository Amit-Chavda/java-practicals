import java.util.ArrayList;
import java.util.stream.Stream;

class Student {
    String name;
    int enrollment;
    float grades;

    public Student(String name, int enrollment, float grades) {
        this.name = name;
        this.enrollment = enrollment;
        this.grades = grades;
    }
}

public class StreamExample {
    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<>();

        studentsList.add(new Student("Tony", 105, 75.57f));
        studentsList.add(new Student("Mike", 102, 57f));
        studentsList.add(new Student("Keven", 107, 85.02f));
        studentsList.add(new Student("John", 101, 60.50f));
        studentsList.add(new Student("Jake", 104, 74.02f));
        studentsList.add(new Student("Tommy", 106, 57.00f));
        studentsList.add(new Student("Sam", 108, 92.25f));
        studentsList.add(new Student("Robert", 103, 85.6f));
        studentsList.add(new Student("Maria", 101, 87.4f));
        studentsList.add(new Student("Birlin", 109, 75.57f));
        studentsList.add(new Student("Robin", 110, 68.88f));

        System.out.println("Students having grades greater than 70\n");
        studentsList.stream()
                .filter(s -> s.grades > 70)
                .forEach(s -> System.out.println(s.enrollment + "  " + s.name + " " + s.grades));

        System.out.println("\n\nStudents list in ascending order by grades\n");
        studentsList.stream()
                .sorted((o1, o2) -> (int) (o1.grades - o2.grades))
                .forEach(s -> System.out.println(s.enrollment + "  " + s.name + " " + s.grades));

    }
}
