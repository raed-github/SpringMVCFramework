package com.rsaad.customer.dao;

import java.util.List;

import com.rsaad.customer.model.Customer;

public interface CustomerDAO 
{
	public void insert(Customer customer);
	
	public void insertNamedParameter(Customer customer);
			
	public void insertBatch(List<Customer> customer);
	
	public void insertBatchNamedParameter(List<Customer> customer);
				
	public void insertBatchSQL(String sql);
	
	public Customer findByCustomerId(int custId);

	public List<Customer> findAll();
	
	public String findCustomerNameById(int custId);
	
	public int findTotalCustomer();
	
}




