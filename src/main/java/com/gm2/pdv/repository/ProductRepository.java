package com.gm2.pdv.repository;

import com.gm2.pdv.entity.Product;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
}
