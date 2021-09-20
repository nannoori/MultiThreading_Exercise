package problem;

public class Item {
    int n;
    boolean statusFlag = false;

    synchronized void put(int n) {
        try {
            while (statusFlag) {
                wait();
            }
        } catch (InterruptedException e) {
        }
        this.n = n;
        System.out.println("Put item: " + n);
        statusFlag = true;
        notify();
    }

    synchronized int get() {
        try {
            while (!statusFlag) {
                wait();
            }
        } catch (InterruptedException e) {
        }
        statusFlag = false;
        System.out.println("Got item: " + n);
        notify();
        return n;
    }
}
