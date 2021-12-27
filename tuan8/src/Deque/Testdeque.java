package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Testdeque {
    public static void main(String[] args) {
        Deque<String> danhsachSv = new ArrayDeque<>();

        danhsachSv.offer("tivi1");
        danhsachSv.offer("nguyen van a");
        danhsachSv.offer("nguyen van b");
        danhsachSv.offer("bach dang tu");

        danhsachSv.offerFirst("bach dang tu 0");
        danhsachSv.offerLast("bach dang tu 1213");

        while (true){
            String ten = danhsachSv.pop();
            if (ten==null){
                break;
            }
            System.out.println(ten);
        }


    }
}
