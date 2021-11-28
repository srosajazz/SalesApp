package com.sergiorosa.SalesApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sergiorosa.SalesApp.dto.SaleDTO;
import com.sergiorosa.SalesApp.dto.SaleSuccessDTO;
import com.sergiorosa.SalesApp.dto.SaleSumDTO;
import com.sergiorosa.SalesApp.entities.Sale;
import com.sergiorosa.SalesApp.repositories.SaleRepository;
import com.sergiorosa.SalesApp.repositories.SellerRepository;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private  SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll(); //evitar consultas repetidas para cada seller pelo Hibernate

        Page<Sale> result = repository.findAll(pageable);

        return result.map( x -> new SaleDTO(x));

    }


    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller(){
        return repository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> sucessGroupedBySeller(){
        return repository.successGroupedBySeller();
    }



}