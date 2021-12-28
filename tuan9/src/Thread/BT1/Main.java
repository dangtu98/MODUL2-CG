package Thread.BT1;

public class Main {
    public static void main(String[] args) {
        NumberGenerator gr = new NumberGenerator();
        NumberGenerator gr1 = new NumberGenerator();
        Thread thread = new Thread(gr);
        Thread thread1 = new Thread(gr1);
        thread.start();
        thread1.start();
        int max = Thread.MAX_PRIORITY;
        int min = Thread.MIN_PRIORITY;
        thread.setPriority(max);
        thread1.setPriority(min);
    }
}
