package Excercise1;

import java.util.ArrayList;
import Excercise1.Employee;

public class question4d {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> EmployeeDB = new ArrayList<Employee>();
		 
		for (int i = 1; i<=30 ; i++) {
			String diff = Integer.toString(i);

			Employee obj = new Employee(diff, i, "CSE", 10000, "add"+diff, 971738467, diff + "@mail.com", "pos" + diff);
			EmployeeDB.add(obj);
		}
		
		System.out.println(EmployeeDB.get(0).header());
		for (int i = 1; i<=30 ; i++) {
			System.out.println(EmployeeDB.get(i-1).toString());
		}
		System.out.println("\n");
		

		EmployeeDB.get(29).delete();
		System.out.println(EmployeeDB.get(0).header());
		for (int i = 1; i<=29 ; i++) {
			System.out.println(EmployeeDB.get(i-1).toString());
		}
		System.out.println("\n");
		
	}
}