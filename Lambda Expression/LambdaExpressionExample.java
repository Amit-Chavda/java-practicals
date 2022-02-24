interface Callable{
    void call(String name);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        Callable c=(name)->System.out.println("Calling "+name);
        c.call("Tony");
    }
}