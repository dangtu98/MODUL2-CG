package TTtimkiem.TH1.BT;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi");
        String input = sc.nextLine();

        LinkedList <Character> max = new LinkedList<>();

//        tìm chuỗi tăng có độ dài lớn
        for(int i = 0 ; i < input.length() ; i++){

            LinkedList <Character> list = new LinkedList<>();
//            thêm kí tự i vào trong list
            list.add(input.charAt(i));
            for (int j  = i ; j < input.length() ; j++){
//                kiểm tra kí tự tiếp theo có lớn hơn kí tự cuối cùng trong list
                if (input.charAt(j) > list.getLast()){
                    list.add(input.charAt(j));
                }
            }
//            so sánh kích cỡ list trung gian và list chứ chuỗi
            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

         for (Character ch : max){
             System.out.println(ch);
         }
        System.out.println();


    }
}
