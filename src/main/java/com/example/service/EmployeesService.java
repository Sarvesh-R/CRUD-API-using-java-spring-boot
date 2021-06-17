package com.example.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employees;
import com.example.repository.EmployeesRepository;

//defining the business logic
@Service
public class EmployeesService 
{
	@Autowired
	EmployeesRepository employeesRepository;
	//getting all employees record by using the method findaAll() of CrudRepository
	public List<Employees> getAllEmployees() 
	{
		List<Employees> employees = new ArrayList<Employees>();
		employeesRepository.findAll().forEach(employees1 -> employees.add(employees1));
		return employees;
	}
	//getting a specific record by using the method findById() of CrudRepository
	public Employees getEmployeesById(int id) 
	{
		return employeesRepository.findById(id).get();
	}
	//saving a specific record by using the method save() of CrudRepository
	public void saveOrUpdate(Employees employees) 
	{
		employeesRepository.save(employees);
	}
	//deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(int id) 
	{
		employeesRepository.deleteById(id);
	}
	//updating a record
	public void update(Employees employees, int employeeid) 
	{
		employeesRepository.save(employees);
	}
}