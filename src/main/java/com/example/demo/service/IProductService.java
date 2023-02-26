package com.example.demo.service;

import java.util.List;

public interface IProductService<Product>{
    List<Product> findAll();

    void save (Product product);
    void delete(int id);
    Product findById(int id);
}
