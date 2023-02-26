package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Product>> findAll(){
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product product){
        productService.save(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable int id){
        return new ResponseEntity<>(productService.findById(id),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        productService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> edit(@RequestBody Product product){
        productService.save(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
