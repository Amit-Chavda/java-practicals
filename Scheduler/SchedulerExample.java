import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class WorkerThread implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "  " + Thread.currentThread().getId());

    }

}

public class SchedulerExample {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
        System.out.println("Thread Name      Id");
        for (int i = 0; i < 5; i++) {
            Thread mThread = new Thread(new WorkerThread());
            mThread.setName("Thread-" + i);
            service.schedule(mThread, i + 1, TimeUnit.SECONDS);
        }
        service.shutdown();
        service.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Is service termnated? : " + service.isTerminated());
        System.out.println("Is service shutdown? : " + service.isShutdown());
    }
}
