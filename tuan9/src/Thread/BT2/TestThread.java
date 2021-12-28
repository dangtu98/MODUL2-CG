package Thread.BT2;

public class TestThread {
    public static void main(String[] args) {
        OddThread odd = new OddThread();
        EvenThread even = new EvenThread();
        Thread thread = new Thread(odd);
        Thread thread1 = new Thread(even);
        thread.start();
        thread1.start();
    }
}
