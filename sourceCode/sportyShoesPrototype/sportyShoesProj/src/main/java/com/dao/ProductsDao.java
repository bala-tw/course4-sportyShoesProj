package com.dao;

import java.util.List;

import com.model.Products;

public interface ProductsDao {
	public List<Products> getAllProducts();
	public Products getProduct(int pid);
	public boolean updateProduct(int pid, String bn, String gd, int size, int price);
	public boolean addProduct(Products product);

}
