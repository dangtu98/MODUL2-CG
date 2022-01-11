package Main;

import Manager.ManagerContact;
import module.Contact;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerContact managerContact = new ManagerContact();
        int choice;
        do{
            System.out.println("----chương trình quản lý danh bạ ----");
            System.out.println("1. xem danh sách");
            System.out.println("2. thêm mới");
            System.out.println("3. cập nhật");
            System.out.println("4. xóa");
            System.out.println("5. tìm kiếm");
            System.out.println("6. Ghi file");
            System.out.println("7. Đọc file");
            System.out.println("0. Exit");
            System.out.println("Nhập chọn: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    managerContact.displayContacts();
                    break;
                case 2:
                    managerContact.addContact();
                    break;
                case 3:
                    System.out.println("nhập vào số điện thoại");
                    String s = scanner.nextLine();
                    managerContact.editContact(s);
                    System.out.println(s);
                    break;
                case 4:
                    System.out.println("Nhập số điện thoại");
                    String s1 = scanner.nextLine();
                    managerContact.deleteContact(s1);
                    System.out.println(s1);
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("Nhập tên muốn tìm: ");
                    String name = scanner.nextLine();
                    ArrayList<Contact> s2 = managerContact.searchContact(name);
                    System.out.println(s2);
                    break;
                case 6:
                  managerContact.writeFile(managerContact.getContactList(), ManagerContact.PATH_NAME);
                  break;
                case 7:
                   ArrayList<Contact> contacts = ManagerContact.readFile(ManagerContact.PATH_NAME);
                   contacts.forEach(System.out::println);
                   break;
            }
        }while (choice!=0);
    }
}
