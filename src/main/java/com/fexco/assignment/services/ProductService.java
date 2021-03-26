package com.fexco.assignment.services;

import java.util.List;

import com.fexco.assignment.commands.ProductForm;
import com.fexco.assignment.domain.Product;


public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);

    void sendProductMessage(String id);
}
