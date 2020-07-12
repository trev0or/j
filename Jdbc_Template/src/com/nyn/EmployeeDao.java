package com.nyn;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public  int saveEmp(Employee e) {
		String query = "insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')" ;
		
		
		return jdbcTemplate.update(query);
		
	}
	public List<Employee> getEmp() { //resultsetextractor
		
		return jdbcTemplate.query("select * from employee", new ResultSetExtractor<List<Employee>>() {

			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<Employee> list= new ArrayList<Employee>();
				while(rs.next()) {
					Employee e = new Employee();
					e.setId(rs.getInt(1));
					 e.setName(rs.getString(2));  
					 e.setSalary(rs.getFloat(3)); 
				     list.add(e);
					
				}
				return list;
			}
		
		});
		
		
	}
	
	public List<Employee> getEmpRowMapper(){
		
		return jdbcTemplate.query("select * from employee", new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int row) throws SQLException {
				// TODO Auto-generated method stub
				Employee e =new Employee();
				e.setId(rs.getInt(1));
				 e.setName(rs.getString(2));  
			     e.setSalary(rs.getFloat(3)); 
						
				return e;
			}
		});
	}
	
}
