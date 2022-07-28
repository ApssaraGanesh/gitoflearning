package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.Productrepositoryimp;
@Service
public class Productserviceimp implements Productservice{
@Autowired
Productrepositoryimp pro;
	@Override
	
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		
			
			return pro.findAll();
		}

		
		public Product findById(Integer id) {
			// TODO Auto-generated method stub
			return pro.findById(id);
		}
		
		public void saveOrUpdate(Product product) {
			pro.saveOrUpdate(product);
		}

	}
  

