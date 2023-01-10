package com.gm2.pdv.repository;

import com.gm2.pdv.entity.Sale;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SaleRepository extends  JpaRepository<Sale, Long>{
}
