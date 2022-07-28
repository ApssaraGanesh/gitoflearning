package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.Productservice;


@RestController
@RequestMapping("/product")

public class Productcontroller {
	
	
		
	
	
		@Autowired
		
		private Productservice proService;
		
		
		@GetMapping("/ProductList")
		public List<Product> findAll(){
			return proService.findAll();
		}
//		@PostMapping("/saveProduct")
//		public String saveEmployee(@RequestBody Product pro) {
////			emp.setEmpno(0);
////			empService.saveOrUpdate(emp);
//
		
//			return "Employee details added successfully!!!";
//		}

		@PostMapping("/saveProduct")
		public String saveProduct(@RequestBody Product product)
		{
			Productservice.saveOrUpdate(product);
			return "Product Details added successfully";
			
		}
		@PutMapping("/updateProduct")
		public String updateProduct(@RequestBody Product pro) throws Exception {
		
			
			Productservice.saveOrUpdate(pro);
			
			return "Category ID : "+ pro.getCategoryid() + " Details updated Succesfully !!"; 
		}

		@DeleteMapping("pro/{id}")
		public String deleteById(@PathVariable int id) {
			Productservice.deleteById(id);
			return "Product ID : " + id +"details  deleted !!!";
		}
		


}
