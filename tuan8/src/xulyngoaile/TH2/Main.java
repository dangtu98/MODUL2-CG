package xulyngoaile.TH2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer [] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n vui lòng nhập chỉ số của một phàn tử bất kì");
        int x = scanner.nextInt();
        try{
            System.out.println("giá trị phần tử có chỉ số 5 " + x + "là" + arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("chỉ số vượt quá giới hạn của mảng");
        }
    }
}
