package problem;

public class Producer implements Runnable {
    Item q;

    Producer(Item q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        while (i < 30 && true) {
            q.put(i++);
        }
    }
}
