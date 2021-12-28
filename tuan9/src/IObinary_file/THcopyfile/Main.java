package IObinary_file.THcopyfile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava8Files(File source , File dest) throws IOException {
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File source , File dest) throws IOException{
        InputStream is = null;
        OutputStream os = null;
        try{
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte [] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer))>0){
                os.write(buffer , 0 , length);
            }
        }finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập source file");
        String source = in.nextLine();
        System.out.println("nhập destination file");
        String dest = in.nextLine();

        File sourceFile = new File(source);
        File destFile = new File(dest);

        try{
            copyFileUsingJava8Files(sourceFile,destFile);
            System.out.println("copy completed");
        }catch (IOException ioe) {
            System.out.println("Can't copy that file");
            System.out.println(ioe.getMessage());
        }
    }
}
