package com.payal.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HelloWorld {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
				
		Employee e1 = new Employee(1, "Payal", 33, 25000);
		Employee e2 = new Employee(2, "Vraj", 35, 15000);
		Employee e3 = new Employee(3, "Ruchi", 41, 10000);
		Employee e4 = new Employee(4, "Saurabh", 43, 5000);
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
		//Find employee name whose age is more than 40
		List<String> fortyUpEmployees = empList.stream().filter(e -> e.age >= 40).map(e -> e.name).toList();
		System.out.println(fortyUpEmployees);
		
		//Find total of salary for the employee 40 and under
		
		double sum = empList.stream().filter(e -> e.age <= 35).mapToInt(e -> e.salary).sum();
		System.out.println(sum);
		
		Optional<String> empName = empList.stream().filter(e -> e.salary >= 20000).map(e -> e.name).findFirst();
		System.out.println(empName);
	}

}
