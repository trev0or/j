package com.nyn;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcMain {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		EmployeeDao dao=(EmployeeDao)context.getBean("edao");  
		Scanner s = new Scanner(System.in);
		int id = s.nextInt();
		String name = s.next();
		float sal = s.nextFloat();
	    int status=dao.saveEmp(new Employee(id, name,sal));
	  //  status =status + dao.saveEmp(new Employee(12, "nayan",32000)); 
	    System.out.println(status);  
	}
}
