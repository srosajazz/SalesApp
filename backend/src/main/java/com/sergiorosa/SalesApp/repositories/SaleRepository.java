package com.sergiorosa.SalesApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiorosa.SalesApp.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>  {

}
