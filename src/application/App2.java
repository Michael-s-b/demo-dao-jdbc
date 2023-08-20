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
    }
}
