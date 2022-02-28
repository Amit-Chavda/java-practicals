class Student implements Cloneable {
    int enrollment = 101;
    String name = "Tony";

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    void print() {
        System.out.println(enrollment + "  " + name);
    }
}

public class ObjectCloningExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        Student student2 = student.clone();

        student.print();
        student2.print();
        System.out.println(student.enrollment + "  " + student2.name);
        System.out.println(student.enrollment + "  " + student2.name);
    }
}
