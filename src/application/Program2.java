package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Department;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Test 1: Department FindById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n=== Test 2: Department FindAll ===");
		
		List<Department> list = new ArrayList<Department>();
				
		list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Test 3: department insert ===");
		Department newDepartment = new Department(null, "Food");
		departmentDao.insert(newDepartment);
		System.out.println("Insert! New id = " + newDepartment.getId());
		
		System.out.println("\n=== Test 4: department update ===");
		department = departmentDao.findById(6);
		department.setName("Drinks");
		departmentDao.update(department);
		System.out.println("Update Completed");
		
		System.out.println("\n=== Test 5: department delete ===");
		System.out.printf("Enter id for delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		sc.close();
	}

}
