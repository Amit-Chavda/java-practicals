class Run implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "  " + Thread.currentThread().getId());
    }

}

public class RunnableExample {
    public static void main(String[] args) {
        System.out.println("Name      Id");
        for (int i = 0; i < 10; i++) {
            Thread mThread = new Thread(new Run());
            mThread.setName("Thread-" + i);
            mThread.start();
        }
    }
}
