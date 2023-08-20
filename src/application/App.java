package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        Department department = new Department(1, "Books");
        Seller seller = new Seller(1, "Bob", "Bob@gmail.com", new Date(), 3000.0, department);
        System.out.println(seller);
    }
}