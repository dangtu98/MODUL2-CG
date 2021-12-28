package IObinary_file.THdocvaghifile;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List <Student> students = new ArrayList<>();
        students.add(new Student(1,"Nguyễn Văn A ","hà nội"));
        students.add(new Student(2,"Nguyễn Văn B" ,"Hà nội"));
        students.add(new Student(3,"Nguyễn Văn C" , "Hà nội"));
        writeToFile("src/IObinary_file/THdocvaghifile/student.txt", students);
        List <Student> students1 = readDataFromFile("src/IObinary_file/THdocvaghifile/student.txt");
        for (Student student : students1){
            System.out.println(student);
        }
    }
    public static void writeToFile(String path , List<Student> students){
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  static  List<Student> readDataFromFile(String path) {
        List<Student> students = null;
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return students;
    }

}
