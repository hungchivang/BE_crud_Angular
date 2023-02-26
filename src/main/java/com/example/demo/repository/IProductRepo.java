package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepo extends CrudRepository<Product,Integer> {

}
