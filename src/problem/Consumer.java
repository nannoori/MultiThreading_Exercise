package problem;

public class Consumer implements Runnable {
    Item q;

    Consumer(Item q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while (true) {
            q.get();

        }
    }
}

