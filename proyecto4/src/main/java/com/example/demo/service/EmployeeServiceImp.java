package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService{

	
	private EmployeeRepository employeeRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Employee> findAll() {
		
		return employeeRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Employee> findAll(Pageable pageable) {
		
		return employeeRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Employee> findById(Long id) {
		
		return employeeRepository.findById(id);
	}

	@Override
	@Transactional
	public Employee save(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		
		employeeRepository.deleteById(id);
		
	}

}
