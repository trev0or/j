package com.nyn;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public  int saveEmp(Employee e) {
		String query = "insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')" ;
		
		
		return jdbcTemplate.update(query);
		
	}
	
}
