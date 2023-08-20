package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        /////////////////////////////////////////////////
        System.out.println("\n=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(5);
        System.out.println(seller);
        /////////////////////////////////////////////////
        System.out.println("\n=== TEST 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        sellerDao.findByDepartment(department).forEach(System.out::println);
        /////////////////////////////////////////////////
        System.out.println("\n=== TEST 3: seller findAll ===");
        sellerDao.findAll().forEach(System.out::println);
        /////////////////////////////////////////////////
        System.out.println("\n=== TEST 4: seller insert ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new java.util.Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());
        /////////////////////////////////////////////////
        System.out.println("\n=== TEST 5: seller update ===");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update complete");
        /////////////////////////////////////////////////
        System.out.println("\n=== TEST 6: seller delete ===");
        sellerDao.deleteById(13);
        System.out.println("Delete complete");
    }
}
