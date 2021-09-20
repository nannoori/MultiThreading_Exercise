package problem;

public class ProducerConsumerTester {
        public static void main(String[] args)
        {
            Item q = new Item();
            Producer p = new Producer(q);
            Consumer c = new Consumer(q);
        }
    }

