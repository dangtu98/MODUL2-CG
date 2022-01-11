package Manager;
import module.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerContact {
    public static final String PATH_NAME = "contact.csv";
    private final Scanner scanner = new Scanner(System.in);
    private final ArrayList<Contact> contactList;

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    public ManagerContact() {
        this.contactList = new ArrayList<>();
    }

    public void addContact() {
        System.out.println("Nhập số điện thoại: ");
        String phone = scanner.nextLine();
        System.out.println("Nhập nhóm danh bạ: ");
        String group = scanner.nextLine();
        System.out.println("Nhập họ và tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        int birth = scanner.nextInt();
        System.out.println("Nhập email: ");
        scanner.nextLine();
        String email = scanner.nextLine();
        contactList.add(new Contact(phone, group, name, gender, address, birth, email));
        writeFile(contactList,PATH_NAME);
    }

    public void displayContacts() {
        for (Contact c : contactList) {
            System.out.println(c);
        }
    }

    public Contact editContact(String phone) {
        Contact contacts = null;
        for (Contact c : contactList) {
            if (c.getPhoneNumber().equals(phone)) {
                contacts = c;
            }
        }
        if (contacts !=null) {
            int index = contactList.indexOf(contacts);
            System.out.println("Nhập số điện thoại: ");
            String phone1 = scanner.nextLine();
            contacts.setPhoneNumber(phone1);
            System.out.println("Nhập nhóm danh bạ: ");
            String group = scanner.nextLine();
            contacts.setGroup(group);
            System.out.println("Nhập họ và tên: ");
            String name = scanner.nextLine();
            contacts.setName(name);
            System.out.println("Nhập giới tính: ");
            String gender = scanner.nextLine();
            contacts.setGender(gender);
            System.out.println("Nhập địa chỉ: ");
            String address = scanner.nextLine();
            contacts.setAddress(address);
            System.out.println("Nhập ngày sinh: ");
            int birth = scanner.nextInt();
            contacts.setBirthday(birth);
            System.out.println("Nhập email: ");
            String email = scanner.nextLine();
            contacts.setEmail(email);
            contactList.set(index, contacts);
            writeFile(contactList,PATH_NAME);
        }
        return contacts;
    }

    public Contact deleteContact(String phone) {
        Contact contacts = null;
        for (Contact c : contactList) {
            if (c.getPhoneNumber().equals(phone)) {
                contacts = c;
            }
        }
        int index = contactList.indexOf(contacts);
        contacts = contactList.remove(index);
        return contacts;
    }

    public ArrayList<Contact> searchContact(String name) {
        ArrayList<Contact> contacts1 = new ArrayList<>();
        for (Contact c : contactList) {
            if (c.getName().equals(name) || c.getPhoneNumber().equals(name)) {
                contacts1.add(c);
            }
        }
        return contacts1;
    }

    public void writeFile(ArrayList<Contact> contacts , String path){
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (Contact contact : contacts){
                bufferedWriter.write(contact.getPhoneNumber()+ ","+
                        contact.getGroup() +","+ contact.getName()+","+contact.getGender()+","+
                        contact.getAddress()+","+contact.getBirthday()+","+contact.getEmail());
            }
            bufferedWriter.close();
            System.out.println("ghi file thanh cong");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static ArrayList<Contact> readFile(String path){
        ArrayList <Contact> contacts1 = new ArrayList<>();
        try{

            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) !=null){
                String [] st = line.split(",");
                contacts1.add(new Contact(st[0],st[1],st[2],st[3],st[4],Integer.parseInt(st[5]),st[6]));
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
        return contacts1;
    }
}
