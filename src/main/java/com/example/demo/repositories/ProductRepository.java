package com.example.demo.repositories;

import java.util.Optional;

import com.example.demo.models.ProductModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<ProductModel, Long>{

    public abstract Optional<ProductModel> findByProduct(String product);

    public abstract Optional<ProductModel> findById(Long id);
} 

