package com.sergiorosa.SalesApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiorosa.SalesApp.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>  {

}
