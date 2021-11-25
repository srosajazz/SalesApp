package com.sergiorosa.SalesApp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sergiorosa.SalesApp.dto.SaleSuccessDTO;
import com.sergiorosa.SalesApp.dto.SaleSumDTO;
import com.sergiorosa.SalesApp.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>  {
	
	
	@Query("SELECT new com.sergiorosa.SalesApp.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.seller ")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.sergiorosa.SalesApp.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) " +
	        " FROM Sale AS obj GROUP BY obj.seller")
	    List<SaleSuccessDTO> sucessGroupedBySeller();
}
