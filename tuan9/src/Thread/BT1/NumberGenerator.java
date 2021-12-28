package Thread.BT1;

public class NumberGenerator implements Runnable {
    @Override
    public void run() {
            for (int i = 0 ; i < 10; i++){
                System.out.println(i);
                System.out.println(hashCode());
            }
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
