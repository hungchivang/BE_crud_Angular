package com.example.demo.service.impl;

import com.example.demo.model.Product;
import com.example.demo.repository.IProductRepo;
import com.example.demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService<Product> {
    @Autowired
    IProductRepo iProductRepo;

    @Override
    public List<Product> findAll() {
        return (List<Product>) iProductRepo.findAll();
    }

    @Override
    public void save(Product product) {
        iProductRepo.save(product);
    }

    @Override
    public void delete(int id) {
        iProductRepo.deleteById(id);
    }

    @Override
    public Product findById(int id) {
        return iProductRepo.findById(id).get();
    }
}
