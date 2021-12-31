package LT.LT2;

import java.io.File;
import java.util.Scanner;

public class ViduFile {
    File file;

    public ViduFile(String tenFile){
        this.file = new File(tenFile);
    }

    public boolean KiemTraThucThi(){
//        kiểm tra file có thể thực thi
        return  this.file.canExecute();
    }

    public boolean KiemTraDoc(){
//        kiểm tra file có thể dọc ghi
        return  this.file.canRead();
    }

    public boolean KiemTraGhi(){
        return this.file.canWrite();
    }

    public void inDuongDan(){
        System.out.println(this.file.getAbsolutePath());
    }

    public void inten(){
        System.out.println(this.file.getName());
    }

    public void inDanhSachCacFileCon(){
        if (this.file.isDirectory()){
            System.out.println("các tập tin con/ thư mục con là:");
            File [] mangCon = this.file.listFiles();
        }else if (this.file.isFile()){
            System.out.println("đây là tập tin , không có dữ liệu con bên trong.");
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luachon =scanner.nextInt();
        System.out.println("nhập tên file :");
        String tenFile = scanner.nextLine();
        ViduFile viduFile = new ViduFile(tenFile);
        do{
            System.out.println("MENU");
            System.out.println("1.Kiểm tra file có thể thực thi :");
            System.out.println("2.Kiểm tra file có thể đọc :");
            System.out.println("3.Kiểm tra file có thể ghi :");
            System.out.println("4.In Đường dẫn :");
            System.out.println("5.in tên file :");
            System.out.println("6.Kiểm tra file là thư mục hoặc tập tin :");
            System.out.println("7.in ra danh sách các file con :");
            System.out.println("8.in ra cây thư mục :");
            System.out.println("0.Exit :");

            switch (luachon){
                case 1:
                    System.out.println(viduFile.KiemTraThucThi());
                    break;
                case 2:
                    System.out.println(viduFile.KiemTraDoc());
                    break;
                case 3:
                    System.out.println(viduFile.KiemTraGhi());
                    break;
            }

        }while (luachon != 0);
    }
}
