package Thread.TH3;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        try{
            while (count.getMyThread().isAlive()){
                System.out.println("Main thread will be");
                Thread.sleep(1500);
            }
        }catch (InterruptedException e){
            System.out.println("Main thread inter");
        }
        System.out.println("Main thread run is over");
    }
}
