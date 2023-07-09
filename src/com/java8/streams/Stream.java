package com.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.pojo.Employee;

public class Stream {

	static List<Employee> initializeList() {
		List<Employee> empList = new ArrayList<>();
		Employee emp1 = new Employee("Ram", 18, 22000f);
		Employee emp2 = new Employee("AbRam", 27, 52000f);
		Employee emp3 = new Employee("Shyam", 44, 72000f);
		Employee emp4 = new Employee("Aam", 66, 12000f);
		Employee emp5 = new Employee("Bam", 72, 102000f);
		Employee emp6 = new Employee("Kataam", 33, 82000f);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
		return empList;
	}

	public static void main(String[] args) {
		List<Employee> empList = initializeList();

		// filter out employees with salary more than 50,000 and collect in a list
		List<Employee> l1 = empList.stream().filter(emp -> emp.getSalary() > 50000).collect(Collectors.toList());

		// filter out employees with salary more than 50,000 and print them
		// empList.stream().filter(emp->emp.getSalary()>50000).forEach(System.out::println);

		// sort employees by age in reverse order and print
		// empList.stream().sorted(Comparator.comparing(Employee::getAge,
		// Comparator.reverseOrder())).forEach(System.out::println);

		// sort employees by age in natural order and print
		// empList.stream().sorted(Comparator.comparing(Employee::getAge,
		// Comparator.naturalOrder())).forEach(System.out::println);

		// sort employees by salary in natural order and print
		// empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(System.out::println);

		// print employee with the third lowest salary
//		empList.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(2)
//				.findFirst().ifPresent(System.out::println);
		
		//print sum of all salaries using reduce
		//empList.stream().map(Employee::getAge).reduce(Integer::sum).ifPresent(System.out::println);;
		
		//print sum of all salaries using reduce + 20
		//System.out.println(empList.stream().map(Employee::getAge).reduce(20, Integer::sum));

	}

}
