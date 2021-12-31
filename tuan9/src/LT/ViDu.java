package LT;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ViDu {
    public static void main(String[] args) {
        File folder1 = new File("src/LT/vidu");
        System.out.println("kiểm tra foder1  " + folder1.exists());
        File folder2 = new File("");
        System.out.println("kiểm tra folder2 " + folder2.exists());


//        tạo thư mục
//phương thức mkdir
//=> tạo 1 thư mục
        File d1 = new File("src/LT/vidu2/directory_1");
        d1.mkdir();

//phương thức mkdirs
//=>tạo ra nhiều thư mục

//tạo tập tin (có phần mở rộng exe , ,txt , .doc , .xls....)
        File file1 = new File("src/LT/vidu1.txt");
        try{
            file1.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }




    }


}
