package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductService {
List<Product> getAllProducts();
void saveProduct(Product product);
void deleteProduct(Product product);


}
