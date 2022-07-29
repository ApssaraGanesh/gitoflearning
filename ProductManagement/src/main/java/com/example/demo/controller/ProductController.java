package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@Controller
@RequestMapping("/Product")

public class ProductController {
	@Autowired
	private ProductService productService;
	
	
	@GetMapping("/Productlist")
public String viewHomePage(Model model) {
	model.addAttribute("listProducts",productService.getAllProducts());
    return "index.html";
	}
	
	@GetMapping("/showNewProductList")
	public String showNewProductList(Model model) {
		Product product = new Product();
		model.addAttribute("product",product);
		return "new_product.html";
	}

@PostMapping("/saveProduct")
	public String saveProduct(@ModelAttribute("product")Product product) {
	productService.saveProduct(product);
	return "redirect:/Product/Productlist";




}
@GetMapping("/delete")
public String deleteById(@ModelAttribute("product")Product product) {
	productService.deleteProduct(product);
	
	return "redirect:/Product/ProductList";
}
@GetMapping("Product/shownewProductList/{id}")
public String shownewProductList(@PathVariable (value = "id")int id,Model model) {
	Product product=productService.getProductById(id);
	model.addAttribute("product",product);
	return "update_product";
}









}




