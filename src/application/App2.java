package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class App2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        /////////////////////////////////////////////////
        System.out.println("\n=== TEST 1: department findById ===");
        Department department = departmentDao.findById(4);
        System.out.println(department);
        /////////////////////////////////////////////////
        System.out.println("\n=== TEST 2: department findAll ===");
        departmentDao.findAll().forEach(System.out::println);
        /////////////////////////////////////////////////
        System.out.println("\n=== TEST 3: department insert ===");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());
        /////////////////////////////////////////////////
        System.out.println("\n=== TEST 4: department deleteById ===");
        departmentDao.deleteById(newDepartment.getId());
        System.out.println("Delete complete");
        /////////////////////////////////////////////////
        System.out.println("\n=== TEST 5: department update ===");
        department = departmentDao.findById(1);
        department.setName("Food");
        departmentDao.update(department);
        System.out.println("Update complete");

    }
}
