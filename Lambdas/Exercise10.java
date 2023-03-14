package dev_1.Lambdas;

public class Product {
    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;


public class Exercise10 {

    public static void main(String[] args) {
        System.out.println(productSupplier().get());
    }

    private static Supplier < List < Product >> productSupplier() {
        Supplier < List < Product >> productSupplier = () -> {
            List < Product > productsList = new ArrayList < Product > ();
            productsList.add(new Product(1, "HP Laptop", 25000f));
            productsList.add(new Product(2, "Dell Laptop", 30000f));
            productsList.add(new Product(3, "Lenevo Laptop", 28000f));
            productsList.add(new Product(4, "Sony Laptop", 28000f));
            productsList.add(new Product(5, "Apple Laptop", 90000f));
            productsList.add(new Product(6, "Apple Laptop", 90000f));
            productsList.add(new Product(7, "Dell Laptop", 30000f));
            productsList.add(new Product(8, "Dell Laptop", 30000f));
            return productsList;
        };
        return productSupplier;
    }
}
