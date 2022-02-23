class Math {

    public float add(int x, float y) {
        return x + y;
    }

    public float add(float x, int y) {
        return x + y;
    }

    public int add(int x, int y) {
        return x + y;
    }

    public float add(float x, float y) {
        return x + y;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }
}

public class OverloadingExample {
    public static void main(String args[]) {
        Math math = new Math();

        System.out.println("7 + 5.25 =" + math.add(7, 5.25f));
        System.out.println("25 + 78 =" + math.add(25, 78));
        System.out.println("49.49 + 1.01 =" + math.add(49.49f, 1.01f));
        System.out.println("3.14 + 24 =" + math.add(3.14f, 24));
        System.out.println("25 + 78 + 12=" + math.add(25, 78, 12));
    }
}