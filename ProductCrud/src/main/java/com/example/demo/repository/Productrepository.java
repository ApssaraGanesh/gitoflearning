package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.Product;

public interface Productrepository {
	public List<Product> findAll();
	public Product findById(Integer id);
	public void saveOrUpdate(Product product);
	
	
	public void deleteById(int empId);

}
