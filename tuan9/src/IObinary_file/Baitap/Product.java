package IObinary_file.Baitap;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String companypro;
    private double price;

    public Product() {
    }

    public Product(int id, String name, String companypro, double price) {
        this.id = id;
        this.name = name;
        this.companypro = companypro;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanypro() {
        return companypro;
    }

    public void setCompanypro(String companypro) {
        this.companypro = companypro;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companypro='" + companypro + '\'' +
                ", price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
