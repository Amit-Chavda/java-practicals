class MyThread extends Thread {

    MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("My name is " + this.getName() + " and my id is " + this.getId());
    }

}

public class ThreadExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MyThread myThread = new MyThread("Thread " + i);
            myThread.start();
        }
    }
}
