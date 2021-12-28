package IObinary_file.Baitap;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerProduct {
    private ArrayList<Product> products;
    private Scanner scanner = new Scanner(System.in);
    private File file = new File("src/IObinary_file/Baitap/product.txt");

    public File getFile() {
        return file;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ManagerProduct() {
        this.products = new ArrayList<>();
    }

    public Product createProduct(){
        Product product = null;
        System.out.println("nhập vào mã sản phẩm");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập vào tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("nhập vào hãng sản phẩm");
        String companypro = scanner.nextLine();
        System.out.println("nhập vào giá sản phẩm");
        double price = scanner.nextDouble();
        product = new Product(id ,name , companypro , price);
        products.add(product);
        writeToFile(file);
        return product;
    }
     public void writeToFile(File file){
        try{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oss = new ObjectOutputStream(fos);
            oss.writeObject(products);
            fos.close();
            oss.close();
        }catch (Exception e){
            e.printStackTrace();
        }
     }

     public ArrayList<Product> readFromFile(File file){
        try{
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (ArrayList<Product>)ois.readObject();
            ois.close();
            fis.close();
        }catch (Exception e){
          e.printStackTrace();
        }
        return products;
     }

    public static void main(String[] args) {
             ManagerProduct managerProduct = new ManagerProduct();
             managerProduct.createProduct();
    }

}
