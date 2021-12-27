package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<String> danhscachSV = new LinkedList<>();
        danhscachSV.offer("tu 2");
        danhscachSV.offer("tu 1");
        danhscachSV.offer("tu 3");
        while (true){
            String ten = danhscachSV.poll();
            if (ten == null){
                break;
            }
            System.out.println(ten);
        }
    }
}
