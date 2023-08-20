package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("\n=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(5);
        System.out.println(seller);
        System.out.println("\n=== TEST 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        sellerDao.findByDepartment(department).forEach(System.out::println);
        System.out.println("\n=== TEST 3: seller findAll ===");
        sellerDao.findAll().forEach(System.out::println);
    }
}
